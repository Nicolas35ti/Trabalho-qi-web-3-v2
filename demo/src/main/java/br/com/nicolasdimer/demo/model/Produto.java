package br.com.nicolasdimer.demo.model;

import java.util.ArrayList;

public class Produto {
    private short id_produto;
    private String nome_produto;
    private ArrayList<String> ingredientes;
    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    private double preco;
    public short getId_produto() {
        return id_produto;
    }
    public void setId_produto(short id_produto) {
        this.id_produto = id_produto;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
