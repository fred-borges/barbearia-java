package org.example.service;


import org.example.model.Cliente;
import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    private Queue<Cliente> fila = new LinkedList<>();
    private int contadorSenha = 1;

    public Cliente gerarSenha(String nome) {
        Cliente cliente = new Cliente(nome, contadorSenha++);
        fila.add(cliente);
        System.out.println("Senha gerada: " + cliente);
        return cliente;
    }

    public Cliente chamarProximo() {
        Cliente cliente = fila.poll();

        if (cliente != null) {
            System.out.println("Chamando: " + cliente);
        } else {
            System.out.println("Fila vazia!");
        }

        return cliente;
    }

    public void mostrarFila() {
        System.out.println("Fila atual:");
        for (Cliente c : fila) {
            System.out.println(c);
        }
    }
}
