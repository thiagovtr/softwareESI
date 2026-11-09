package br.ufla.agendainteligente.repositorio;
import br.ufla.agendainteligente.dominio.Disponibilidade; import java.util.*; import org.springframework.data.jpa.repository.JpaRepository;
public interface RepositorioDisponibilidade extends JpaRepository<Disponibilidade, Long>{ List<Disponibilidade> findByProfissionalIdOrderByDiaSemanaAscHoraInicioAsc(Long profissionalId); List<Disponibilidade> findByProfissionalIdAndDiaSemanaOrderByHoraInicioAsc(Long profissionalId, Integer diaSemana); }
