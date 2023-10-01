package KraftHeinzVasco.Sprint.domain.proposta.proposta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
    @Override Page<Proposta> findAll(Pageable paginacao);
}
