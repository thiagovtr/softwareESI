package br.ufla.agendainteligente.dto;
import jakarta.validation.constraints.*; import java.time.*; import java.util.List;
public final class Dtos {
 private Dtos(){}
 public record ServicoResposta(Long id, String nome, Integer duracaoMinutos) {}
 public record DisponibilidadeResposta(Long id, Integer diaSemana, LocalTime horaInicio, LocalTime horaFim) {}
 public record AgendamentoResposta(Long id, String servico, String nomeCliente, String contatoCliente, OffsetDateTime inicio, OffsetDateTime fim) {}
 public record PerfilPublicoResposta(String nome, String slug) {}
 public record PaginaPublicaResposta(PerfilPublicoResposta profissional, List<ServicoResposta> servicos) {}
 public record CriarServicoPedido(@NotBlank @Size(max=100) String nome, @NotNull @Min(15) @Max(480) Integer duracaoMinutos) {}
 public record CriarDisponibilidadePedido(@NotNull @Min(1) @Max(7) Integer diaSemana, @NotNull LocalTime horaInicio, @NotNull LocalTime horaFim) {}
 public record CriarAgendamentoPedido(@NotNull Long servicoId, @NotNull LocalDate data, @NotNull LocalTime horario, @NotBlank @Size(max=120) String nomeCliente, @NotBlank @Size(max=120) String contatoCliente) {}
}
