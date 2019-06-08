package com.easyworks.apirest.resources;
import com.easyworks.apirest.models.Supermercado;
import com.easyworks.apirest.repositorys.SupermercadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class SupermercadoResource {

    @Autowired
    SupermercadoRepository supermercadoRepository;


    @GetMapping("/supermercado")
    public List<Supermercado> listaSupermercados(){
        return supermercadoRepository.findAll();
    }

    @GetMapping("/supermercado/{id_supermercado}")
    public Supermercado retornaUnicoSuper(@PathVariable(value = "id_supermercado") int id_supermercado){
        return supermercadoRepository.findById(id_supermercado);
    }

    @PostMapping("/supermercado")
    public Supermercado adicionaSupermercado(@RequestBody Supermercado supermercado){
        return supermercadoRepository.save(supermercado);
    }

    @DeleteMapping("/supermercado")
    public void deleteSupermercado(@RequestBody Supermercado supermercado){
        supermercadoRepository.delete(supermercado);
    }

    @PutMapping("/supermercado")
    public Supermercado atualizaSupermercado(@RequestBody Supermercado supermercado){
        return supermercadoRepository.save(supermercado);
    }



}
