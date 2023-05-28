package com.atividade1.modelo;

public class Reserva {
    private Voo voo;
    private Passageiro passageiro;
    private String assento;

    public Reserva(Voo voo, Passageiro passageiro, String assento) {
        this.voo = voo;
        this.passageiro = passageiro;
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}

