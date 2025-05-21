package br.pucpr.devops.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService calculadora = new CalculadoraService();

    @Test
    void somaDe2Mais3DeveSer5() {
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void somaDeNumerosNegativos() {
        int resultado = calculadora.somar(-1, -1);
        assertEquals(-2, resultado);
    }

    @Test
    void subtracaoDe5Menos3DeveSer2() {
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void subtracaoComNumerosNegativos() {
        int resultado = calculadora.subtrair(-2, -3);
        assertEquals(1, resultado);
    }
}
