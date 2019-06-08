package com.easyworks.apirest.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
/**====================================================================================
 *
 * Criação de nossa entidade Usuário para o banco
 *
 * ====================================================================================
 * */
public class Usuario implements Serializable {

    //private static final String serialVersionUID = "1";
    //parametro para passar para o banco quando necessitamos que
    //ele gere altomaticamente o ID para as classes

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //este parametro indica para o banco que deve carregar
    //automaticamente o ID para a classe usuário, mas como
    //estamos usando o CPF como pkey não será usado


    private String cpf;
    private String nome;
    private int idade;
    private String email;
    private Double salario;
    private String senha;


    /**====================================================================================
     *
     * Gets e sets para o usuario
     *
     * ====================================================================================
     * */

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
