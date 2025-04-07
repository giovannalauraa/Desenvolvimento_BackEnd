package com.exercicios_backend1.exercicios_backend1.exercicio2.service;

import com.exercicios_backend1.exercicios_backend1.exercicio2.interfaces.IProcessadorPedido;
import com.exercicios_backend1.exercicios_backend1.exercicio2.interfaces.IValidadorEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessadorPedido implements IProcessadorPedido {

    private final IValidadorEstoque validador;

    @Autowired
    public ProcessadorPedido(IValidadorEstoque validador) {
        this.validador = validador;
    }

    @Override
    public void processarPedido(String produto, int quantidade) {
        if (validador.validarEstoque(produto, quantidade)) {
            System.out.println("Pedido confirmado de " + quantidade + "x " + produto);
        } else {
            System.out.println("Estoque insuficiente para " + produto);
        }
    }
}
