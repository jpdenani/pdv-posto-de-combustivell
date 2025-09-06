package com.br.domain.entity;

import java.util.Date;

public class Pessoa {
       //atributos
    private String nomeCompleto;

    private String cpfCNPJ;

    private Date dataNascimento;

    private Integer numeroCtps;
    //construtor
    public Pessoa (String nomeCompleto,  String cpfCNPJ, Date dataNascimento, Integer numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCNPJ = cpfCNPJ;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }
    //getters //setters
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public void setNomeCompleto (String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpfCNPJ(){
        return cpfCNPJ;
    }
    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Integer getNumeroCtps(){
        return numeroCtps;
    }
    public void setNumeroCtps(Integer numeroCtps) {
        this.numeroCtps = numeroCtps;
    }
}