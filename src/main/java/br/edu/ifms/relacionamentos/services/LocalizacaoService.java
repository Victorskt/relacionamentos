package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Localizacao;
import br.edu.ifms.relacionamentos.repository.LocalizacaoRepository;

@Service
public class LocalizacaoService {

    LocalizacaoRepository repository;

    public List<Localizacao> getLocalizacao() {
        return repository.findAll();
    }

    public void buscaId(Localizacao id) {
        repository.findAll();
    }

    public void insereLoc(Localizacao localizacao) {

        this.repository.save(localizacao);

    }

    public void atualizaLoc(Localizacao localizacao) {
        repository.save(localizacao);

    }

    public void deleteLoc(Localizacao localizacao) {
        repository.delete(localizacao);
    }
}