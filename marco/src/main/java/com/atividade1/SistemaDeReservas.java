package com.atividade1;

import java.util.ArrayList;
import java.util.List;

import com.atividade1.modelo.Passageiro;
import com.atividade1.modelo.Reserva;
import com.atividade1.modelo.Voo;

public final class SistemaDeReservas {
    private List<Voo> voos;
    private List<Passageiro> passageiros;
    private List<Reserva> reservas;

    public SistemaDeReservas() {
        voos = new ArrayList<>();
        passageiros = new ArrayList<>();
        reservas = new ArrayList<>();
    }
    public void cadastrarVoo(Voo voo) {
        voos.add(voo);
        System.out.println("Voo cadastrado com sucesso!");
    }
    public void cadastrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
        System.out.println("Passageiro cadastrado com sucesso!");
    }
    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva realizada com sucesso!");

    }
    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva cancelada com sucesso!");

    }
    public boolean consultarDisponibilidade(Voo voo) {
        int capacidade = voo.getCapacidade();
        int reservasExistentes = 0;

        for (Reserva reserva : reservas) {
            if (reserva.getVoo().equals(voo)) {
                reservasExistentes++;
            }
        }

        int disponibilidade = capacidade - reservasExistentes;

        System.out.println("Disponibilidade de assentos: " + disponibilidade);
        return disponibilidade > 0;
    }



}
