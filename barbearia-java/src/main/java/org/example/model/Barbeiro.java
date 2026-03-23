package org.example.model;


public class Barbeiro extends Funcionario {

    public Barbeiro(String nome) {
        super(nome);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está cortando cabelo...");
    }
}