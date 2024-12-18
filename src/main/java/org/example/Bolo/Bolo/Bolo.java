package org.example.Bolo.Bolo;

import org.example.Bolo.Cobertura.Cobertura;

public abstract class Bolo {
    protected Cobertura cobertura;
    protected boolean pronto;

    public Bolo(Cobertura cobertura) {
        this.cobertura = cobertura;
    }
    public abstract void preparar();
    public abstract double getPrecoFinal();

}
