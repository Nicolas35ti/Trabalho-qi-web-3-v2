package br.com.nicolasdimer.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Pagamento {
    private short id;
    private String formaPagamento;
    private double valor;
    private Cliente contaUsuario;
    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Cliente getContaUsuario() {
        return contaUsuario;
    }
    public void setContaUsuario(Cliente contaUsuario) {
        this.contaUsuario = contaUsuario;
    }
}
