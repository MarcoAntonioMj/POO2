package com.atividade1.modelo;

public class Voo {
    private int numero;
    private String origem;
    private String destino;
    private int capacidade;

    public Voo(int numero, String origem, String destino, int capacidade) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
