package org.example.model;

public class Cliente extends Pessoa {

    private int senha;

    public Cliente(String nome, int senha) {
        super(nome);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | Senha: " + senha;
    }
}