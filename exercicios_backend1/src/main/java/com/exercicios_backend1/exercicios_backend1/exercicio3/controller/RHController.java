package com.exercicios_backend1.exercicios_backend1.exercicio3.controller;

import com.exercicios_backend1.exercicios_backend1.exercicio3.service.CalculadoraFolha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rh")
public class RHController {

    @Autowired
    private CalculadoraFolha folha;

    @PostMapping("/salario")
    public double calcular(@RequestBody int[] horas, @RequestParam double valorHora) {
        return folha.calcularSalario(horas, valorHora); 
    }
}
