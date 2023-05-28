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

}
