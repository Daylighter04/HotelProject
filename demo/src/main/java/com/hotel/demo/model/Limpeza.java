package com.hotel.demo.model;

public class Limpeza extends Funcionario {
    public Limpeza(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Realizando limpeza...");
    }
}
