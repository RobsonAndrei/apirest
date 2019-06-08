package com.easyworks.apirest.repositorys;
import com.easyworks.apirest.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**===============================================================================================
 *          Este JPA repository serve para ajudar muito a vida do desenvolvedor
 *          pois ela já traz pronto vários métodos pronto para fazer a persistencia no banco de
 *          dados, save - delete - findAll - findbyID todos já vem pronto... muito mais fácil
 *          sem DAO e action - facilita muuuuuuito...
 *
 *          Ao criar a classe passamos a classe e o ID
 *
 * ===============================================================================================*/

public interface UsuarioRepository extends JpaRepository <Usuario, String>{

    /**===============================================================================================
     *          Mátodo que retorna apenas um unico usuario de acordo com o cpf passado por
     *          parametro.
     *
     * ===============================================================================================*/
    Usuario findByCpf(String cpf);

}
