package com.example.roberthsantos.homecutadmin.models;

public class Servico {
    public String getIdServico() {
        return idServico;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    private String idServico;
    private String nome;
    private Double valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private Produto produto;

    public void setIdServico(String idServico) {
        this.idServico = idServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Servico() {
    }

    public Servico(String idServico, String nome, Double valor) {
        this.idServico = idServico;
        this.nome = nome;
        this.valor = valor;
    }
}
