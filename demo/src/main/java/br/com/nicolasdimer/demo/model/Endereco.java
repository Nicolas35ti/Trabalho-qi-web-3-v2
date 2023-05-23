package br.com.nicolasdimer.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Endereco implements Serializable{
    Restaurante restaurante;

    private Short id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    
    public Restaurante getRestaurante(){
        return restaurante;
    }
    public void setRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    }

    public Short getId() {
        return id;
    }
    public void setId(Short id) {
        this.id = id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}