package umc.devapp.crud_livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.devapp.crud_livraria.entity.LivroEntity;
import umc.devapp.crud_livraria.repository.LivroRepository;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // 1. listar todos
    public List<LivroEntity> listarTodos() {
        return livroRepository.findAll();
    }

    // 2. buscar por id
    public LivroEntity buscarPorId(String id) {
        return livroRepository.findById(id).orElse(null);
    }

    // 3. salvar
    public LivroEntity salvar(LivroEntity livro) {
        return livroRepository.save(livro);
    }

    // 4. deletar
    public void deletar(String id) {
        livroRepository.deleteById(id);
    }

    // 5. atualizar
    public LivroEntity atualizar(String id, LivroEntity livro) {
        LivroEntity existente = livroRepository.findById(id).orElse(null);

        if (existente != null) {
            existente.setNomeLivro(livro.getNomeLivro());
            existente.setAutor(livro.getAutor());
            existente.setStatus(livro.getStatus());

            return livroRepository.save(existente);
        }

        return null;
    }
}