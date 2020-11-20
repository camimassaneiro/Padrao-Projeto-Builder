
package builder;

/**
 *
 * @author camil
 */
public class BancoCaixa extends Banco{

    @Override
    public void construirCarteira(String carteira) {
        boleto.setCarteira(new CarteiraCaixa(carteira));
    }

    @Override
    public void construirCedente(String cedente) {
        boleto.setCedente(new CedenteCaixa(cedente));
    }

    @Override
    public void construirNossoNumero(String nossoNumero) {
        boleto.setNossoNumero(new NossoNumeroCaixa(nossoNumero));
    }
    
    
}
