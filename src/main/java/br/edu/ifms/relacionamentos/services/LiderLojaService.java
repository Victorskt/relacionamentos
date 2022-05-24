package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.LiderLoja;
import br.edu.ifms.relacionamentos.repository.LiderLojaRepository;

@Service
public class LiderLojaService {

    LiderLojaRepository repository;

    public List<LiderLoja> getLiderLoja() {
        return repository.findAll();
    }

    public void buscaId(LiderLoja id) {
        repository.findAll();
    }

    public void insereLider(LiderLoja liderloja) {

        this.repository.save(liderloja);

    }

    public void atualizaLider(LiderLoja liderloja) {
        repository.save(liderloja);

    }

    public void deleteLider(LiderLoja liderloja) {
        repository.delete(liderloja);
    }
}