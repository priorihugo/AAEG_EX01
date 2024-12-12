package org.example.Bolo.Cobertura;

public class CoberturaMorango implements Cobertura{



    @Override
    public void aplicarCobertura() {

    }

    @Override
    public double getPreco() {
        return 2;
    }

    @Override
    public String toString() {
        return "Morango | Preco:" + getPreco();
    }
}
