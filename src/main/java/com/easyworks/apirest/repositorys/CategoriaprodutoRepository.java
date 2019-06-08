package com.easyworks.apirest.repositorys;
import com.easyworks.apirest.models.Categoriaproduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaprodutoRepository extends JpaRepository<Categoriaproduto, Integer> {

    Categoriaproduto findById(int id_categoria);
}
