package com.br.domain.entity;

public class Produto {

    private String nome ;
    private String referencia;
    private String categoria;
    private String fornecedor;
    private String marca;

    public Produto (String nome, String referencia, String categoria, String fornecedor, String marca){
        this.nome = nome;
        this.referencia = referencia;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.marca = marca;
    }
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getReferencia(){
        return referencia;
    }
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getFornecedor(){
        return fornecedor;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}