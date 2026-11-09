package br.ufla.agendainteligente.repositorio;
import br.ufla.agendainteligente.dominio.Servico; import java.util.*; import org.springframework.data.jpa.repository.JpaRepository;
public interface RepositorioServico extends JpaRepository<Servico, Long>{ List<Servico> findByProfissionalIdAndAtivoTrueOrderByNome(Long profissionalId); Optional<Servico> findByIdAndProfissionalId(Long id, Long profissionalId); }
