package com.exercicios_backend1.exercicios_backend1.exercicio1.controller;

import com.exercicios_backend1.exercicios_backend1.exercicio1.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/financeiro")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @PostMapping("/calcular-juros")
    public double calcularJurosCompostos(@RequestBody JurosRequest jurosRequest) {
        return financeiroService.calcularJurosCompostos(jurosRequest.getPrincipal(), jurosRequest.getTaxa(), jurosRequest.getTempo());
    }

    @PostMapping("/calcular-amortizacao")
    public double calcularAmortizacao(@RequestBody AmortizacaoRequest amortizacaoRequest) {
        return financeiroService.calcularAmortizacao(amortizacaoRequest.getValorTotal(), amortizacaoRequest.getParcelas());
    }
}
