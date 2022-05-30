package br.edu.ifms.relacionamentos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.relacionamentos.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, UUID>{
    
}
