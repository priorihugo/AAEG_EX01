package org.example.Bolo;

import org.example.Bolo.Cobertura.TipoCobertura;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class LojaDeBolosTest {

    private LojaDeBolos loja;

    @BeforeEach
    public void setUp() {
        loja = LojaDeBolos.getInstancia();
    }

    @Test
    public void testRegistrarPedido() {
        this.loja = LojaDeBolos.getInstancia();
        Pedido pedido = new Pedido("Simples", TipoCobertura.CHOCOLATE, 2);
        loja.registrarPedido(pedido);

        assertEquals(1, loja.getPedidos().size());
        assertEquals(pedido, loja.getPedidos().get(0));
    }

    @Test
    public void testPrepararPedidos() throws Exception {
        this.loja = LojaDeBolos.getInstancia();
        loja.registrarPedido(new Pedido("Simples", TipoCobertura.MORANGO, 2));
        loja.registrarPedido(new Pedido("Recheado", TipoCobertura.CARAMELO, 1));

        loja.prepararPedidos();

        assertEquals(3, loja.getBolosProntos().size()); // 2 bolos simples e 1 bolo recheado
    }

    @Test
    public void testCalcularTotal() throws Exception {
        this.loja = LojaDeBolos.getInstancia();
        loja.registrarPedido(new Pedido("Simples", TipoCobertura.MORANGO, 1));
        loja.registrarPedido(new Pedido("Recheado", TipoCobertura.CHOCOLATE, 2));

        loja.prepararPedidos();
        double total = loja.calcularTotal();

        assertEquals(530, total, 0.01);
    }

    @Test
    public void testFinalizarPreparacao() {
        loja = LojaDeBolos.getInstancia();
        loja.registrarPedido(new Pedido("Simples", TipoCobertura.CHOCOLATE, 1));
        loja.registrarPedido(new Pedido("Recheado", TipoCobertura.CARAMELO, 1));

        loja.prepararPedidos();
        loja.finalizarPreparacao();

        assertTrue(loja.getPedidos().isEmpty());
        assertTrue(loja.getBolosProntos().isEmpty());
    }
}