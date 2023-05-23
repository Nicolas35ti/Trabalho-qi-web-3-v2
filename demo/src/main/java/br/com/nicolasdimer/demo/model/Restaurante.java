package br.com.nicolasdimer.demo.model;

import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Restaurante {
    private Short id;
    private String nome_restaurante;
    private String telefone_restaurante;
    @JsonFormat (pattern = "endereco.getRua() , endereco.getNumero() , endereco.getBairro() , endereco.getCidade() , endereco.getEstado()")
    private Endereco endereco;
    private Boolean status;
    public Short getId() {
        return id;
    }
    public void setId(Short id) {
        this.id = id;
    }
    public String getNome_restaurante() {
        return nome_restaurante;
    }
    public void setNome_restaurante(String nome_restaurante) {
        this.nome_restaurante = nome_restaurante;
    }
    public String getTelefone_restaurante() {
        return telefone_restaurante;
    }
    public void setTelefone_restaurante(String telefone_restaurante) {
        this.telefone_restaurante = telefone_restaurante;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public static boolean validPhone (String telefone_restaurante){
        return telefone_restaurante.matches("^(1[1-9]|[4689][0-9]|2[12478]|3([1-5]|[7-8])|5([13-5])|7[193-7])9[0-9]{8}$");
    }
    public String getPlaceEndereco(){
        String actualEndereco = endereco.getRua() + ", " + endereco.getNumero() + ", " + endereco.getBairro() +", " + endereco.getCidade()+ ", " + endereco.getEstado();
        return actualEndereco;
    }
}
