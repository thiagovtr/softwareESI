package br.ufla.agendainteligente.dominio;
import jakarta.persistence.*; import java.time.OffsetDateTime;
@Entity @Table(name="agendamentos")
public class Agendamento {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) @JoinColumn(name="profissional_id") private Profissional profissional;
 @ManyToOne(optional=false) @JoinColumn(name="servico_id") private Servico servico;
 @Column(name="nome_cliente", nullable=false) private String nomeCliente;
 @Column(name="contato_cliente", nullable=false) private String contatoCliente;
 @Column(nullable=false) private OffsetDateTime inicio;
 @Column(nullable=false) private OffsetDateTime fim;
 public Long getId(){return id;} public Servico getServico(){return servico;} public String getNomeCliente(){return nomeCliente;} public String getContatoCliente(){return contatoCliente;} public OffsetDateTime getInicio(){return inicio;} public OffsetDateTime getFim(){return fim;}
 public void criar(Profissional profissional, Servico servico, String nomeCliente, String contatoCliente, OffsetDateTime inicio, OffsetDateTime fim){this.profissional=profissional;this.servico=servico;this.nomeCliente=nomeCliente;this.contatoCliente=contatoCliente;this.inicio=inicio;this.fim=fim;}
}
