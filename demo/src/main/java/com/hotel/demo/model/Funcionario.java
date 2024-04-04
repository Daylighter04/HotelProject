package com.hotel.demo.model;

public abstract class Funcionario {
    protected String nome;
    protected int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract void realizarTarefa();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}