package com.hotel.demo.model;

public class Gerente extends Main implements Gerenciavel {
    public Gerente(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void gerenciar() {
        System.out.println("Gerenciando funcionários...");
    }
}