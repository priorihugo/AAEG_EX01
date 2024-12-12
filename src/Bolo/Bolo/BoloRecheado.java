package Bolo.Bolo;

import Bolo.Cobertura.Cobertura;

public class BoloRecheado extends  Bolo{

    private final double precoBase;
    private final int peso;
    private final double tamanho;


    public BoloRecheado(Cobertura cobertura, double precoBase, int peso , double tamanho) {
        super(cobertura);
        this.precoBase = precoBase;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    @Override
    public void preparar() {

        cobertura.aplicarCobertura();
        System.out.println(this.toString());
        pronto = true;

    }

    @Override
    public double getPrecoFinal() {
        return (peso * precoBase) + (tamanho * cobertura.getPreco()) ;
    }

    @Override
    public String toString() {
        return "BoloRecheado{" +
                "precoBase=" + precoBase +
                ", peso=" + peso +
                ", tamanho=" + tamanho +
                ", cobertura=" + cobertura +
                '}';
    }
}
