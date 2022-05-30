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

import br.edu.ifms.relacionamentos.model.SuperMercado;
import br.edu.ifms.relacionamentos.services.SuperMercadoService;

@Controller
@RequestMapping("/supermercado")
public class SuperMercadoController {

    @Autowired
    SuperMercadoService supermercadoService;

    @GetMapping("/")
    public String listSuperMercado(Model model) {
        List<SuperMercado> supermercados = new ArrayList<SuperMercado>();
        supermercados = supermercadoService.getSuperMercado();
        model.addAttribute("supermercao", supermercados);
        return "list-supermercado";
    }

    @GetMapping("/novo")
    public String novoSuperMercado(Model model) {
        model.addAttribute("supermercado", new SuperMercado());
        return "cadastrar-supermercado";
    }

    @PostMapping("/save")
    public String novoSuperMercado(@ModelAttribute SuperMercado pp) {
        supermercadoService.saveSuperMercado(pp);
        return "redirect:/supermercado/";
    }

}