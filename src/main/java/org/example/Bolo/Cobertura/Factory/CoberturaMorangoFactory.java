package org.example.Bolo.Cobertura.Factory;

import org.example.Bolo.Cobertura.Cobertura;
import org.example.Bolo.Cobertura.CoberturaMorango;

public class CoberturaMorangoFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaMorango();
    }
}
