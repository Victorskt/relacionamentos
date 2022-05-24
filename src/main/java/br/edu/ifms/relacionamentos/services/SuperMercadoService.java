package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.SuperMercado;
import br.edu.ifms.relacionamentos.repository.SuperMercadoRepository;

@Service
public class SuperMercadoService {

    SuperMercadoRepository repository;

    public List<SuperMercado> getSuperMercado() {
        return repository.findAll();
    }

    public void buscaId(SuperMercado id) {
        repository.findAll();
    }

    public void insereSup(SuperMercado supermercado) {

        this.repository.save(supermercado);

    }

    public void atualizaSup(SuperMercado supermercado) {
        repository.save(supermercado);

    }

    public void deleteSup(SuperMercado superMercado) {
        repository.delete(superMercado);
    }
}