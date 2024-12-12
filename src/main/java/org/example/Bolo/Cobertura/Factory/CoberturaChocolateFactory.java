package org.example.Bolo.Cobertura.Factory;

import org.example.Bolo.Cobertura.Cobertura;
import org.example.Bolo.Cobertura.CoberturaChocolate;

public class CoberturaChocolateFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaChocolate();
    }
}
