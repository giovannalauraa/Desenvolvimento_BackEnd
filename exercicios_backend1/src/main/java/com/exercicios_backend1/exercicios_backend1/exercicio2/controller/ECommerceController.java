package com.exercicios_backend1.exercicios_backend1.exercicio2.controller;

import com.exercicios_backend1.exercicios_backend1.exercicio2.service.ProcessadorPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ecommerce")
public class ECommerceController {

    @Autowired
    private ProcessadorPedido processador;

    @PostMapping("/pedido")
    public void fazerPedido(@RequestParam String produto, @RequestParam int quantidade) {
        processador.processarPedido(produto, quantidade);
    }
}
