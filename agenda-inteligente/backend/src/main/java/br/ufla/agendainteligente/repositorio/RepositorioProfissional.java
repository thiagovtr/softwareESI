package br.ufla.agendainteligente.repositorio;
import br.ufla.agendainteligente.dominio.Profissional; import java.util.Optional; import org.springframework.data.jpa.repository.JpaRepository;
public interface RepositorioProfissional extends JpaRepository<Profissional, Long>{ Optional<Profissional> findBySlug(String slug); }
