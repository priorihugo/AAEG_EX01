package Bolo.Cobertura.Factory;

import Bolo.Cobertura.Cobertura;
import Bolo.Cobertura.CoberturaCaramelo;

public class CoberturaCarameloFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaCaramelo();
    }
}
