package umc.devapp.crud_livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import umc.devapp.crud_livraria.service.LivroService;

@Controller
public class LivroWebController {

    @Autowired
    private LivroService service;

    // Página principal
    @GetMapping("/")
    public String principal() {
        return "principal";
    }

    // LISTAR TODOS OS LIVROS
    @GetMapping("/home")
    public String listar(Model model) {
        model.addAttribute("livros", service.listarTodos());
        return "listar-todos";
    }

    // CADASTRAR LIVRO
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastrar";
    }

    // BUSCAR POR ID
    @GetMapping("/buscar")
    public String buscar() {
        return "listarid";
    }

    // ATUALIZAR LIVRO
    @GetMapping("/atualizar")
    public String atualizar() {
        return "atualizar";
    }

    // DELETAR LIVRO
    @GetMapping("/deletar")
    public String deletar() {
        return "delete";
    }
}
