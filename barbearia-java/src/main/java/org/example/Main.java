package org.example;

import org.example.service.Barbearia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Barbearia barbearia = new Barbearia("Carlos");

        int opcao;

        do {
            System.out.println("\n===== SISTEMA BARBEARIA =====");
            System.out.println("1 - Novo Cliente");
            System.out.println("2 - Atender Cliente");
            System.out.println("3 - Ver Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    barbearia.novoCliente(nome);
                    break;

                case 2:
                    barbearia.atenderCliente();
                    break;

                case 3:
                    barbearia.verFila();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}