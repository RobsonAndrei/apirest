package com.easyworks.apirest.resources;



import com.easyworks.apirest.models.Usuario;
import com.easyworks.apirest.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

@CrossOrigin(origins = "*")

/**====================================================================================
 *
 * Este resource faz a instanciação das entidades que irão fazer a comunicação com o
 * banco de dados, os métodos aqui fazem o get e set e demais alteraçãos direto no
 * banco de dados.
 *
 * ====================================================================================
 * */

public class UsuarioResource {

    @Autowired
    UsuarioRepository usuarioRepository;


    /**
     * ====================================================================================
     *
     * Este método retorna json com a lista de totos os usuarios e seus dados
     *
     * ====================================================================================
     */
    @GetMapping("/usuario")
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }

    /**
     * ====================================================================================
     *
     * Este método retorna um usuário apenas, passando o cpf como parametro, com o
     * recuros FindByCpf construido na USUARIORESOURCE
     *
     * ====================================================================================
     */
    @GetMapping("/usuario/{cpf}")
    public Usuario retornaUsuarioUnico(@PathVariable(value = "cpf") String cpf) {
        return usuarioRepository.findByCpf(cpf);
    }

    /**
     * ====================================================================================
     *
     * Este método adiociona uma novo usuário no banco de dados
     *
     * ====================================================================================
     */
    @PostMapping("/usuario")
    public Usuario adicionaUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    /**
     * ====================================================================================
     *
     * Este método Deleta um usuário
     *
     * ====================================================================================
     */
    @DeleteMapping("/usuario")
    public void deleteUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    /**
     * ====================================================================================
     *
     * Este método atualiza um usuario
     *
     * ====================================================================================
     */

    @PutMapping("/usuario")
    public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }




}
