package br.ufla.agendainteligente.dominio;
import jakarta.persistence.*; import java.time.LocalTime;
@Entity @Table(name="disponibilidades")
public class Disponibilidade {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) @JoinColumn(name="profissional_id") private Profissional profissional;
 @Column(name="dia_semana", nullable=false) private Integer diaSemana;
 @Column(name="hora_inicio", nullable=false) private LocalTime horaInicio;
 @Column(name="hora_fim", nullable=false) private LocalTime horaFim;
 public Long getId(){return id;} public Integer getDiaSemana(){return diaSemana;} public LocalTime getHoraInicio(){return horaInicio;} public LocalTime getHoraFim(){return horaFim;}
 public void criar(Profissional profissional, Integer diaSemana, LocalTime horaInicio, LocalTime horaFim){this.profissional=profissional;this.diaSemana=diaSemana;this.horaInicio=horaInicio;this.horaFim=horaFim;}
}
