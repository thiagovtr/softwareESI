package br.ufla.agendainteligente.controlador;
import br.ufla.agendainteligente.dominio.Profissional; import br.ufla.agendainteligente.dto.Dtos.*; import br.ufla.agendainteligente.servico.ServicoAgenda; import jakarta.validation.Valid; import java.time.*; import java.util.*; import org.springframework.http.*; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/publico/{slug}")
public class ControladorPublico {
 private final ServicoAgenda agenda; public ControladorPublico(ServicoAgenda agenda){this.agenda=agenda;}
 @GetMapping public PaginaPublicaResposta pagina(@PathVariable String slug){Profissional profissional=agenda.profissional(slug);return new PaginaPublicaResposta(new PerfilPublicoResposta(profissional.getNome(),profissional.getSlug()),agenda.listarServicos(profissional));}
 @GetMapping("/horarios") public List<LocalTime> horarios(@PathVariable String slug,@RequestParam Long servicoId,@RequestParam LocalDate data){return agenda.horariosLivres(agenda.profissional(slug),servicoId,data);}
 @PostMapping("/agendamentos") public ResponseEntity<AgendamentoResposta> agendar(@PathVariable String slug,@Valid @RequestBody CriarAgendamentoPedido pedido){return ResponseEntity.status(HttpStatus.CREATED).body(agenda.criarAgendamento(agenda.profissional(slug),pedido));}
}
