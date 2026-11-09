package br.ufla.agendainteligente.dominio;
import jakarta.persistence.*;
@Entity @Table(name="servicos")
public class Servico {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) @JoinColumn(name="profissional_id") private Profissional profissional;
 @Column(nullable=false) private String nome;
 @Column(name="duracao_minutos", nullable=false) private Integer duracaoMinutos;
 @Column(nullable=false) private boolean ativo=true;
 public Long getId(){return id;} public String getNome(){return nome;} public Integer getDuracaoMinutos(){return duracaoMinutos;} public boolean isAtivo(){return ativo;}
 public void criar(Profissional profissional, String nome, Integer duracaoMinutos){this.profissional=profissional;this.nome=nome;this.duracaoMinutos=duracaoMinutos;}
 public void desativar(){ativo=false;}
}
