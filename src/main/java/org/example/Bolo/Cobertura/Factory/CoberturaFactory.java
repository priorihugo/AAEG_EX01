package org.example.Bolo.Cobertura.Factory;

import org.example.Bolo.Cobertura.Cobertura;
import org.example.Bolo.Cobertura.TipoCobertura;

public abstract class CoberturaFactory {
//    public static CoberturaFactory getInstance(String tipo) throws Exception {
//        switch (tipo){
//            case "Caramelo" : return new CoberturaCarameloFactory();
//            case "Chocolate" : return new CoberturaChocolateFactory();
//            case "Morango" : return new CoberturaMorangoFactory();
//            default: throw new Exception("Tipo não implementado");
//        }
//    }
//
//


    public static CoberturaFactory getInstance(TipoCobertura tipo) throws Exception {

        if (tipo == null){
            throw new Exception("Tipo não implementado");
        }

        switch (tipo){
            case TipoCobertura.CARAMELO: return new CoberturaCarameloFactory();
            case TipoCobertura.CHOCOLATE: return new CoberturaChocolateFactory();
            case TipoCobertura.MORANGO: return new CoberturaMorangoFactory();
            default: throw new Exception("Tipo não implementado");
        }
    }

    public abstract Cobertura criarCobertura();
}
