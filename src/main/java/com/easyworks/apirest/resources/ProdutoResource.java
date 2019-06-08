package com.easyworks.apirest.resources;

import com.easyworks.apirest.models.Produto;
import com.easyworks.apirest.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")

public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;


    @GetMapping("/produto")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id_produto}")
    public Produto retornaProdutoUnico(@PathVariable(value = "id_produto") int id_produto) {
        return produtoRepository.findById(id_produto);
    }

    @PostMapping("/produto")
    public Produto adicionaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
