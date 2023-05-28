package com.atividade1.modelo;

import java.util.Scanner;

public class Passageiro {
    private String nome;
    private int cpf;

    public void coletaNome(Scanner scanner) {
        nome = scanner.nextLine();
    }

    public void coletaCpf(Scanner scanner) {
        cpf = scanner.nextInt();
        scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do passageiro:");
        coletaNome(scanner);
        System.out.println("Digite o CPF do passageiro:");
        coletaCpf(scanner);
        scanner.close();
    }
}

