package com.api_produtos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.api_produtos.demo.model.Produto;
import com.api_produtos.demo.repository.ProdutoRepository;



@Controller
public class HelloController {
    @Autowired
    private ProdutoRepository produtorepository;

    @GetMapping("/")
    public String listarProdutos(Model model){
        model.addAttribute("produtos", produtorepository.findAll());
        return "lista";
    }

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model){
        model.addAttribute("produto", new Produto() );
        return "cadastro";
    }
    @PostMapping("/cadastro")
     public String cadastraProduto(Produto produto){
        produtorepository.save(produto);
        return "redirect:/";
     }
    

}
