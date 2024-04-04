package com.hotel.demo.model;

public class Recepcionista extends Funcionario {
    public Recepcionista(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Atendendo clientes...");
    }
}