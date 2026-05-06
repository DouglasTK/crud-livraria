package umc.devapp.crud_livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umc.devapp.crud_livraria.entity.LivroEntity;
import umc.devapp.crud_livraria.service.LivroService;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    // retorna lista dos livros
    @GetMapping("/livros")
    public ResponseEntity<List<LivroEntity>> getAllLivros() {
        List<LivroEntity> livros = livroService.listarTodos();
        return ResponseEntity.ok(livros);
    }

    // retorna os dados do livro pelo id informado
    @GetMapping("/livros/{id}")
    public ResponseEntity<LivroEntity> getLivroById(@PathVariable String id) {
        LivroEntity livro = livroService.buscarPorId(id);
        return ResponseEntity.ok(livro);
    }

    // insere livro na base de dados
    @PostMapping("/livros/add")
    public ResponseEntity<LivroEntity> addLivro(@RequestBody LivroEntity livro) {
        LivroEntity newLivro = livroService.salvar(livro);
        return new ResponseEntity<>(newLivro, HttpStatus.CREATED);
    }

    // atualiza cadastro do livro
    @PutMapping("/livros/update")
    public ResponseEntity<LivroEntity> updateLivro(@RequestBody LivroEntity livro) {
        LivroEntity updatedLivro = livroService.atualizar(livro.getId(), livro);
        return ResponseEntity.ok(updatedLivro);
    }

    // deleta os dados do livro pelo id informado
    @DeleteMapping("/livros/delete/{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable String id) {
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}