package com.exercicios_backend1.exercicios_backend1.exercicio1.service;

import com.exercicios_backend1.exercicios_backend1.exercicio1.interfaces.IAmortizacao;
import com.exercicios_backend1.exercicios_backend1.exercicio1.interfaces.IJurosCompostos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

    // Método para calcular juros compostos
    public double calcularJurosCompostos(double principal, double taxa, int tempo) {
        return principal * Math.pow(1 + taxa, tempo);  // Fórmula de juros compostos
    }

    // Método para calcular amortização
    public double calcularAmortizacao(double valorTotal, int parcelas) {
        return valorTotal / parcelas;  // Método simples de amortização
    }
}