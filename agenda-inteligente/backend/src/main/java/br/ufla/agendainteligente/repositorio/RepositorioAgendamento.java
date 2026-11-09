package br.ufla.agendainteligente.repositorio;
import br.ufla.agendainteligente.dominio.Agendamento; import java.time.OffsetDateTime; import java.util.*; import org.springframework.data.jpa.repository.*; import org.springframework.data.repository.query.Param;
public interface RepositorioAgendamento extends JpaRepository<Agendamento, Long>{
 @Query("select a from Agendamento a where a.profissional.id=:profissionalId and a.inicio < :fim and a.fim > :inicio order by a.inicio")
 List<Agendamento> buscarSobrepostos(@Param("profissionalId") Long profissionalId, @Param("inicio") OffsetDateTime inicio, @Param("fim") OffsetDateTime fim);
 @Query("select a from Agendamento a where a.profissional.id=:profissionalId and a.inicio >= :inicio and a.inicio < :fim order by a.inicio")
 List<Agendamento> buscarPorPeriodo(@Param("profissionalId") Long profissionalId, @Param("inicio") OffsetDateTime inicio, @Param("fim") OffsetDateTime fim);
}
