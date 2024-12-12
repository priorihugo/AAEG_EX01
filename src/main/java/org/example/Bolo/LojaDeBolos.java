package org.example.Bolo;

import org.example.Bolo.*;
import org.example.Bolo.Bolo.*;
import org.example.Bolo.Bolo.Factory.*;
import org.example.Bolo.Cobertura.Factory.CoberturaFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Singleton
public final class LojaDeBolos {
    private static LojaDeBolos instancia;

    private List<Pedido> pedidos;
    private List<Bolo> bolosProntos;
    private LojaDeBolos() {
        this.pedidos = new ArrayList<>();
        this.bolosProntos = new ArrayList<>();
        this.contatorDeBolo = 0;
    }

    private int contatorDeBolo;

    public static synchronized LojaDeBolos getInstancia() {
        if (instancia == null) {
            instancia = new LojaDeBolos();
        }
        return instancia;
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("Pedido registrado: " + pedido.toString());
        this.pedidos.add(pedido);
    }

    public void prepararPedidos(){

        try {
            for (Pedido p : pedidos){
                BoloFactory bFactory = BoloFactory.getInstance(p.getTipo());
                CoberturaFactory cFactory = CoberturaFactory.getInstance(p.getCobertura());

                for (int i = 0 ; i < p.getNumero() ; i++){
                    Bolo b = bFactory.criarBolo(cFactory.criarCobertura());
                    b.preparar();
                    bolosProntos.add(b);
                    this.contatorDeBolo++;
                }
            }
            pedidos.clear();
        }catch (Exception e){
            //rollback
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Bolo b : bolosProntos){
            total += b.getPrecoFinal();
        }
        return total;
    }

    public void finalizarPreparacao(){
        this.pedidos.clear();
        this.bolosProntos.clear();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Bolo> getBolosProntos() {
        return bolosProntos;
    }
}
