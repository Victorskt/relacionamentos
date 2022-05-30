package br.edu.ifms.relacionamentos.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Projeto;
import br.edu.ifms.relacionamentos.repository.ProjetoRepository;

@Service

public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public List<Projeto> getProjeto() {
        return projetoRepository.findAll();
    }

    public void saveProjeto(Projeto projeto) {
        projetoRepository.save(projeto);
    }

    public void delete(UUID id) {
        projetoRepository.deleteById(id);
    }

}