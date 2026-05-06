package umc.devapp.crud_livraria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import umc.devapp.crud_livraria.entity.LivroEntity;

public interface LivroRepository extends MongoRepository<LivroEntity, String> {
}