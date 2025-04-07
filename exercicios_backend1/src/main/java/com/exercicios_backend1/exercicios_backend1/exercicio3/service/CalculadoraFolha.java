package com.exercicios_backend1.exercicios_backend1.exercicio3.service;

import com.exercicios_backend1.exercicios_backend1.exercicio3.interfaces.ICalculadoraFolha;
import com.exercicios_backend1.exercicios_backend1.exercicio3.interfaces.IContabilizadorHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraFolha implements ICalculadoraFolha {

    @Override
    public double calcularSalario(int[] horasDiarias, double valorHora) {
        int totalHoras = 0;
        for (int horas : horasDiarias) {
            totalHoras += horas;
        }

        return totalHoras * valorHora;
    }
}