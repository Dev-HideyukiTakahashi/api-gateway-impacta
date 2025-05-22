package br.com.impacta.api_gateway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.api_gateway.model.Componente;

public interface ComponenteRepository extends JpaRepository<Componente, Long> {

    List<Componente> findAllByPeca_Codigo(String codigo);

}
