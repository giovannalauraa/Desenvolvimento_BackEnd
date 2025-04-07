package com.exercicios_backend1.exercicios_backend1.exercicio1.controller;

public class AmortizacaoRequest {
    private double valorTotal;
    private int parcelas;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
