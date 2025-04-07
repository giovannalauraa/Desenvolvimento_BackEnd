package com.exercicios_backend1.exercicios_backend1.exercicio3.service;

import com.exercicios_backend1.exercicios_backend1.exercicio3.interfaces.IContabilizadorHoras;
import org.springframework.stereotype.Service;

@Service
public class ContabilizadorHoras implements IContabilizadorHoras {
    @Override
    public int calcularHoras(int[] horasDiarias) {
        int total = 0;
        for (int h : horasDiarias) total += h;
        return total;
    }
}
