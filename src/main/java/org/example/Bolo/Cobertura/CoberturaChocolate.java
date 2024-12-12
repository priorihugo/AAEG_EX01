package org.example.Bolo.Cobertura;

public class CoberturaChocolate implements Cobertura {
    @Override
    public void aplicarCobertura() {

    }

    @Override
    public double getPreco() {
        return 4;
    }
    @Override
    public String toString() {
        return "Chocolate | Preco:" + getPreco();
    }

}
