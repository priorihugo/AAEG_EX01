package Bolo.Bolo.Factory;

import Bolo.Bolo.Bolo;
import Bolo.Cobertura.Cobertura;

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
