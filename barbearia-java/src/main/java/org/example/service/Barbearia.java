package org.example.service;


import org.example.model.Barbeiro;
import org.example.model.Cliente;

public class Barbearia {

    private FilaAtendimento fila;
    private Barbeiro barbeiro;

    public Barbearia(String nomeBarbeiro) {
        this.fila = new FilaAtendimento();
        this.barbeiro = new Barbeiro(nomeBarbeiro);
    }

    public void novoCliente(String nome) {
        fila.gerarSenha(nome);
    }

    public void atenderCliente() {
        Cliente cliente = fila.chamarProximo();

        if (cliente != null) {
            barbeiro.trabalhar();
            System.out.println("Atendido: " + cliente.getNome());
        }
    }

    public void verFila() {
        fila.mostrarFila();
    }
}