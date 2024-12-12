package org.example;

import org.example.Bolo.*;
import org.example.Bolo.Cobertura.TipoCobertura;

public class Main {
    public static void main(String[] args) {

        var loja = LojaDeBolos.getInstancia();

//        loja.registrarPedido(new Pedido("Simples" , "Morango" , 1));
//        loja.registrarPedido(new Pedido("Simples" , "Chocolate" , 2));
//        loja.registrarPedido(new Pedido("Recheado" , "Caramelo" , 3));
//        loja.registrarPedido(new Pedido("Recheado" , "Chocolate" , 4));

        loja.registrarPedido(new Pedido("Simples" , TipoCobertura.MORANGO , 1));
        loja.registrarPedido(new Pedido("Simples" , TipoCobertura.CHOCOLATE , 2));
        loja.registrarPedido(new Pedido("Recheado" , TipoCobertura.CARAMELO , 3));
        loja.registrarPedido(new Pedido("Recheado" , TipoCobertura.CHOCOLATE , 4));

        loja.prepararPedidos();
        double total = loja.calcularTotal();

        System.out.println("Total: R$" + total  );
        loja.finalizarPreparacao();

    }
}