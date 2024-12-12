package org.example.Bolo.Cobertura.Factory;

import org.example.Bolo.Cobertura.Cobertura;
import org.example.Bolo.Cobertura.TipoCobertura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoberturaFactoryTest {

    @Test
    public void testCriarCoberturaCaramelo() throws Exception {
        Cobertura cobertura = CoberturaFactory.getInstance(TipoCobertura.CARAMELO).criarCobertura();
        assertNotNull(cobertura);
        assertEquals(3.0, cobertura.getPreco(), 0.01);
    }

    @Test
    public void testCriarCoberturaChocolate() throws Exception {
        Cobertura cobertura = CoberturaFactory.getInstance(TipoCobertura.CHOCOLATE).criarCobertura();
        assertNotNull(cobertura);
        assertEquals(4.0, cobertura.getPreco(), 0.01);
    }

    @Test
    public void testCriarCoberturaMorango() throws Exception {
        Cobertura cobertura = CoberturaFactory.getInstance(TipoCobertura.MORANGO).criarCobertura();
        assertNotNull(cobertura);
        assertEquals(2.0, cobertura.getPreco(), 0.01);
    }

    @Test
    public void testTipoCoberturaInvalido() {
        Exception exception = assertThrows(Exception.class, () -> {
            CoberturaFactory.getInstance(null).criarCobertura();
        });
        assertEquals("Tipo não implementado", exception.getMessage());
    }
}