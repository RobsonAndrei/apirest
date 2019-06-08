package com.easyworks.apirest.resources;


import com.easyworks.apirest.models.Categoriaproduto;
import com.easyworks.apirest.repositorys.CategoriaprodutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class CategoriaprodutoResource {

    @Autowired
    CategoriaprodutoRepository categoriaprodutoRepository;

    @GetMapping("/categoriaproduto")
    public List<Categoriaproduto> listaCategorias() {
        return categoriaprodutoRepository.findAll();
    }

    @GetMapping("/categoriaproduto/{id_categoria}")
    public Categoriaproduto retornaUmaUnicaCategoria(@PathVariable(value = "id_categoria") int id_categoria) {
        return categoriaprodutoRepository.findById(id_categoria);
    }

    @PostMapping("/categoriaproduto")
    public Categoriaproduto adicionaCategoria(@RequestBody Categoriaproduto categoriaproduto){
        return categoriaprodutoRepository.save(categoriaproduto);
    }

    @DeleteMapping("/categoriaproduto")
    public void deletacategoria(@RequestBody Categoriaproduto categoriaproduto){
        categoriaprodutoRepository.delete(categoriaproduto);
    }


    @PutMapping("/categoriaproduto")
    public Categoriaproduto atualizaCategoria(@RequestBody Categoriaproduto categoriaproduto){
        return  categoriaprodutoRepository.save(categoriaproduto);
    }

}
