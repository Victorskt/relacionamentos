package br.edu.ifms.relacionamentos.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.LiderLoja;
import br.edu.ifms.relacionamentos.repository.LiderLojaRepository;

@Service

public class LiderLojaService {

    @Autowired
    LiderLojaRepository liderlojaRepository;

    public List<LiderLoja> getLiderLoja() {
        return liderlojaRepository.findAll();
    }

    public void saveLiderLoja(LiderLoja liderloja) {
        liderlojaRepository.save(liderloja);
    }

    public void delete(UUID id) {
        liderlojaRepository.deleteById(id);
    }

}