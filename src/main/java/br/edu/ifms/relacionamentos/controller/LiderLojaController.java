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

import br.edu.ifms.relacionamentos.model.LiderLoja;
import br.edu.ifms.relacionamentos.services.LiderLojaService;

@Controller
@RequestMapping("/liderloja")
public class LiderLojaController {

    @Autowired
    LiderLojaService liderlojaService;

    @GetMapping("/")
    public String listLiderLoja(Model model) {
        List<LiderLoja> liderlojas = new ArrayList<LiderLoja>();
        liderlojas = liderlojaService.getLiderLoja();
        model.addAttribute("liderloja", liderlojas);
        return "list-liderloja";
    }

    @GetMapping("/novo")
    public String novoLocalizacao(Model model) {
        model.addAttribute("liderloja", new LiderLoja());
        return "cadastrar-liderloja";
    }

    @PostMapping("/save")
    public String novoLiderLoja(@ModelAttribute LiderLoja tt) {
        liderlojaService.saveLiderLoja(tt);
        return "redirect:/liderloja/";
    }

}