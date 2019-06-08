package com.easyworks.apirest.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supermercado")

public class Supermercado implements Serializable {


    private static final int serialVersionUID = 1;
    //parametro para passar para o banco quando necessitamos que
    //ele gere altomaticamente o ID para as classes

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //este parametro indica para o banco que deve carregar
    //automaticamente o ID para a classe supermercado.


    private int id_supermercado;
    private Double latitude;
    private Double longitude;
    private String telefone;
    private String nome;
    private String cpf;



    public int getId() {
        return id_supermercado;
    }

    public void setId(int id_supermercado) {
        this.id_supermercado = id_supermercado;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
