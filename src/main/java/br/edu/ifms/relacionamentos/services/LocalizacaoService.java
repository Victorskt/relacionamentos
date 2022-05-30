package br.edu.ifms.relacionamentos.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Localizacao;
import br.edu.ifms.relacionamentos.repository.LocalizacaoRepository;

@Service

public class LocalizacaoService {

    @Autowired
    LocalizacaoRepository localizacaoRepository;

    public List<Localizacao> getLocalizacao() {
        return localizacaoRepository.findAll();
    }

    public void saveLocalizacao(Localizacao localizacao) {
        localizacaoRepository.save(localizacao);
    }

    public void delete(UUID id) {
        localizacaoRepository.deleteById(id);
    }

}