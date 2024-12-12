package org.example.Bolo;

import org.example.Bolo.Cobertura.TipoCobertura;

public class Pedido {
    private int numero;
    private String tipo;
    private TipoCobertura cobertura;

//    public Pedido(String tipo , String cobertura , int numero  ) {
//        this.tipo = tipo;
//        this.numero = numero;
//        this.cobertura = cobertura;
//    }

    public Pedido(String tipo , TipoCobertura cobertura , int numero  ) {
        this.tipo = tipo;
        this.numero = numero;
        this.cobertura = cobertura;
    }


    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public TipoCobertura getCobertura() {
        return cobertura;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder = builder.append("Número: " + numero + "\n");
        builder = builder.append("Tipo: " + tipo + "\n");
        builder = builder.append("Cobertura: " + cobertura + "\n");

        return builder.toString();
    }
}
