package com.exercicios_backend1.exercicios_backend1.exercicio1.service;

import com.exercicios_backend1.exercicios_backend1.exercicio1.interfaces.IJurosCompostos;
import org.springframework.stereotype.Service;

@Service
public class JurosCompostos implements IJurosCompostos {
    @Override
    public double calcularJuros(double principal, double taxa, int tempo) {
        return principal * Math.pow((1 + taxa / 100), tempo);
    }
}
