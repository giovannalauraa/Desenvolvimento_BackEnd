package com.exercicios_backend1.exercicios_backend1.exercicio2.service;

import com.exercicios_backend1.exercicios_backend1.exercicio2.interfaces.IValidadorEstoque;
import org.springframework.stereotype.Service;

@Service
public class ValidadorEstoque implements IValidadorEstoque {

    @Override
    public boolean validarEstoque(String produto, int quantidade) {
        return quantidade <= 10; 
    }
}
