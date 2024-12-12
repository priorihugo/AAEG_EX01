package org.example.Bolo.Bolo.Factory;

import org.example.Bolo.Bolo.Bolo;
import org.example.Bolo.Bolo.BoloRecheado;
import org.example.Bolo.Cobertura.Cobertura;

public class BoloRecheadoFactory extends BoloFactory {

    private double precoBase = 20.0;
    private int peso = 3;
    private double tamanho = 2;

    @Override
    public Bolo criarBolo(Cobertura cobertura) {
        return new BoloRecheado(cobertura , precoBase , peso, tamanho );
    }
}
