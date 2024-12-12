package Bolo.Bolo.Factory;

import Bolo.Bolo.Bolo;
import Bolo.Bolo.BoloSimples;
import Bolo.Cobertura.Cobertura;

public class BoloSimplesFactory extends BoloFactory {

    private double precoBase = 20.0;
    private int peso = 3;
    private double tamanho = 2;

    @Override
    public Bolo criarBolo(Cobertura cobertura) {
        return new BoloSimples(cobertura , precoBase , peso , tamanho);
    }
}
