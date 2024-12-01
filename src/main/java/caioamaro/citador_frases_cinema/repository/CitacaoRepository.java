package caioamaro.citador_frases_cinema.repository;

import caioamaro.citador_frases_cinema.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitacaoRepository extends JpaRepository<Citacao, Long> {
}
