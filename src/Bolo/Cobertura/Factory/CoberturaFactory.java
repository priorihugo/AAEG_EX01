package Bolo.Cobertura.Factory;

import Bolo.Cobertura.Cobertura;
import Bolo.Cobertura.CoberturaCaramelo;

public abstract class CoberturaFactory {
    public static CoberturaFactory getInstance(String tipo) throws Exception {
        switch (tipo){
            case "Caramelo" : return new CoberturaCarameloFactory();
            case "Chocolate" : return new CoberturaChocolateFactory();
            case "Morango" : return new CoberturaMorangoFactory();
            default: throw new Exception("Tipo não implementado");
        }
    }

    public abstract Cobertura criarCobertura();
}
