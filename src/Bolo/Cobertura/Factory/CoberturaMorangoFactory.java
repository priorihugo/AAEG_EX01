package Bolo.Cobertura.Factory;

import Bolo.Cobertura.Cobertura;
import Bolo.Cobertura.CoberturaMorango;

public class CoberturaMorangoFactory extends CoberturaFactory {
    @Override
    public Cobertura criarCobertura() {
        return new CoberturaMorango();
    }
}
