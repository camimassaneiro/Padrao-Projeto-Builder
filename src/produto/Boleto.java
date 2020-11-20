package produto;

public class Boleto {

    private Cedente cedente;
    private Carteira carteira;
    private NossoNumero nossoNumero;

    public Cedente getCedente() {
        return cedente;
    }

    public void setCedente(Cedente cedente) {
        this.cedente = cedente;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public NossoNumero getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(NossoNumero nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String toString() {
        return cedente + " - " + carteira + " - " + nossoNumero;
    }

}
