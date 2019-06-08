package com.easyworks.apirest.repositorys;

import com.easyworks.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    Produto findById(int id_produto);
}
