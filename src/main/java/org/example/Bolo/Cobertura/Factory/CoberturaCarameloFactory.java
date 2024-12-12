package org.example.Bolo.Cobertura.Factory;

import org.example.Bolo.Cobertura.Cobertura;
import org.example.Bolo.Cobertura.CoberturaCaramelo;

public class CoberturaCarameloFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaCaramelo();
    }
}
