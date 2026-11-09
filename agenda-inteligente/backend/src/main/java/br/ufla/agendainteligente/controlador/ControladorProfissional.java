package br.ufla.agendainteligente.controlador;
import br.ufla.agendainteligente.dominio.Profissional; import br.ufla.agendainteligente.dto.Dtos.*; import br.ufla.agendainteligente.servico.ServicoAgenda; import jakarta.validation.Valid; import java.time.LocalDate; import java.util.*; import org.springframework.http.*; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/profissional")
public class ControladorProfissional {
 private static final String SLUG="agenda-inteligente"; private final ServicoAgenda agenda; public ControladorProfissional(ServicoAgenda agenda){this.agenda=agenda;} private Profissional profissional(){return agenda.profissional(SLUG);}
 @GetMapping("/perfil") public PerfilPublicoResposta perfil(){Profissional p=profissional();return new PerfilPublicoResposta(p.getNome(),p.getSlug());}
 @GetMapping("/servicos") public List<ServicoResposta> servicos(){return agenda.listarServicos(profissional());}
 @PostMapping("/servicos") ResponseEntity<ServicoResposta> criarServico(@Valid @RequestBody CriarServicoPedido pedido){return ResponseEntity.status(HttpStatus.CREATED).body(agenda.criarServico(profissional(),pedido));}
 @DeleteMapping("/servicos/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) void excluirServico(@PathVariable Long id){agenda.desativarServico(profissional(),id);}
 @GetMapping("/disponibilidades") public List<DisponibilidadeResposta> disponibilidades(){return agenda.listarDisponibilidades(profissional());}
 @PostMapping("/disponibilidades") ResponseEntity<DisponibilidadeResposta> criarDisponibilidade(@Valid @RequestBody CriarDisponibilidadePedido pedido){return ResponseEntity.status(HttpStatus.CREATED).body(agenda.criarDisponibilidade(profissional(),pedido));}
 @DeleteMapping("/disponibilidades/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) void excluirDisponibilidade(@PathVariable Long id){agenda.excluirDisponibilidade(profissional(),id);}
 @GetMapping("/agendamentos") public List<AgendamentoResposta> agenda(@RequestParam LocalDate data){return agenda.agenda(profissional(),data);}
}
