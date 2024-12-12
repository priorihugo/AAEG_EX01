package org.example.Bolo.Bolo.Factory;

import org.example.Bolo.Bolo.Bolo;
import org.example.Bolo.Cobertura.Cobertura;

public abstract class BoloFactory {
    public abstract Bolo criarBolo(Cobertura cobertura);
    public static BoloFactory getInstance(String tipo) throws Exception {

        switch (tipo){

            case "Simples" : return new BoloSimplesFactory();
            case "Recheado" : return new BoloRecheadoFactory();

            default:
                throw new Exception("Tipo não implementado");
        }

    }
}
