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

import br.edu.ifms.relacionamentos.model.Funcionario;
import br.edu.ifms.relacionamentos.services.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @Autowired
    @GetMapping("/")
    public String listFuncionario(Model model) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios = funcionarioService.getFuncionarios();
        model.addAttribute("funcionarios", funcionarios);
        return "list-funcionario";
    }

    @PostMapping("/save")
    public String novoFuncionario(@ModelAttribute Funcionario p) {
        funcionarioService.saveFuncionario(p);
        return "redirect:/funcionario/";
    }

}