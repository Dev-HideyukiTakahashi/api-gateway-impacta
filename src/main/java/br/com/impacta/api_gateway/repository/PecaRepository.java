package br.com.impacta.api_gateway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.api_gateway.model.Peca;

public interface PecaRepository extends JpaRepository<Peca, Long> {

    boolean existsByCodigo(String codigo);

    Optional<Peca> findByCodigo(String codigo);
}
