package org.example.model;

public abstract class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome);
    }

    public abstract void trabalhar();
}