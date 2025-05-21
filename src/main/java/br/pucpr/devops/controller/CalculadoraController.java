package br.pucpr.devops.controller;

import br.pucpr.devops.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    private final CalculadoraService service;

    @Autowired
    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/somar")
    public int somar(@RequestParam int a, @RequestParam int b) {
        return service.somar(a, b);
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int a, @RequestParam int b) {
        return service.subtrair(a, b);
    }
}
