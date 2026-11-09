package br.ufla.agendainteligente.dominio;
import jakarta.persistence.*;
@Entity @Table(name = "profissionais")
public class Profissional {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String nome;
 @Column(nullable=false, unique=true) private String slug;
 public Long getId(){return id;} public String getNome(){return nome;} public String getSlug(){return slug;}
}
