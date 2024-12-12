package Bolo.Cobertura;

public class CoberturaCaramelo implements  Cobertura{
    @Override
    public void aplicarCobertura() {

    }

    @Override
    public double getPreco() {
        return 3;
    }

    @Override
    public String toString() {
        return "Caramelo | Preco:" + getPreco();
    }
}
