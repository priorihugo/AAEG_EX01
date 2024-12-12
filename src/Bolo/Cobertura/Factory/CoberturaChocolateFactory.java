package Bolo.Cobertura.Factory;

import Bolo.Cobertura.Cobertura;
import Bolo.Cobertura.CoberturaChocolate;

public class CoberturaChocolateFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaChocolate();
    }
}
