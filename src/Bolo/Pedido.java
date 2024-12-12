package Bolo;

public class Pedido {
    private int numero;
    private String tipo;
    private String cobertura;

    public Pedido(String tipo , String cobertura , int numero  ) {
        this.tipo = tipo;
        this.numero = numero;
        this.cobertura = cobertura;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCobertura() {
        return cobertura;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder = builder.append("Número: " + numero + "\n");
        builder = builder.append("Tipo: " + tipo + "\n");
        builder = builder.append("Cobertura: " + cobertura + "\n");

        return builder.toString();
    }
}
