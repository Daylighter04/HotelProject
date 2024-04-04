package com.hotel.demo.model;

public class Main {
    public Main(String nome, int id) {

    }

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Limpeza("João", 1);
        funcionarios[1] = new Recepcionista("Maria", 2);
        funcionarios[2] = new Funcionario("Carlos", 3) {
            @Override
            public void realizarTarefa() {

            }
        };

        for (Funcionario funcionario : funcionarios) {
            funcionario.realizarTarefa();
        }
    }
}