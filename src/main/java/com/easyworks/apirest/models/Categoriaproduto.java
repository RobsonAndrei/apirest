package com.easyworks.apirest.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categoriaproduto")
public class Categoriaproduto implements  Serializable{

    private static final int serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_categoria;
    private String nome;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
