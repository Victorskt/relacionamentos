package br.edu.ifms.relacionamentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.relacionamentos.model.Localizacao;
import br.edu.ifms.relacionamentos.services.LocalizacaoService;

@Controller
@RequestMapping("/localizacao")
public class LocalizacaoController {

    @Autowired
    LocalizacaoService localizacaoService;

    @GetMapping("/")
    public String listLocalizacao(Model model) {
        List<Localizacao> localizacoes = new ArrayList<Localizacao>();
        localizacoes = localizacaoService.getLocalizacao();
        model.addAttribute("localizacao", localizacoes);
        return "list-localizacao";
    }

    @GetMapping("/novo")
    public String novoLocalizacao(Model model) {
        model.addAttribute("localizacao", new Localizacao());
        return "cadastrar-localizacao";
    }

    @PostMapping("/save")
    public String novoLocalizacao(@ModelAttribute Localizacao vv) {
        localizacaoService.saveLocalizacao(vv);
        return "redirect:/Funcionario/";
    }

}