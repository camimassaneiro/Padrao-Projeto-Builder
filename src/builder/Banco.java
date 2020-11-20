package builder;

import produto.Boleto;

public abstract class Banco {

    Boleto boleto;

    public void construirCedente(String cedente) {
    }

    public void construirCarteira(String carteira) {
    }

    public void construirNossoNumero(String nossoNumero) {
    }

    public Boleto getBoleto(){
        return boleto;
    }

    public void reset(){
        this.boleto = new Boleto();
    }
}
