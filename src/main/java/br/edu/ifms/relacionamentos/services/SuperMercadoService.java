package br.edu.ifms.relacionamentos.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.ifms.relacionamentos.model.SuperMercado;
import br.edu.ifms.relacionamentos.repository.SuperMercadoRepository;

@Service

public class SuperMercadoService {

    @Autowired
    SuperMercadoRepository supermercadoRepository;

    public List<SuperMercado> getSuperMercado() {
        return supermercadoRepository.findAll();
    }

    public void saveSuperMercado(SuperMercado supermercado) {
        supermercadoRepository.save(supermercado);
    }

    public void delete(UUID id) {
        supermercadoRepository.deleteById(id);
    }

}