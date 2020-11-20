
package builder;

import produto.Cedente;

/**
 *
 * @author camil
 */
public class BancoBradesco extends Banco{

    @Override
    public void construirCarteira(String carteira) {
        boleto.setCarteira(new CarteiraBradesco("06")); 
        
    }

    @Override
    public void construirCedente(String cedente) {
        boleto.setCedente(new CedenteBradesco(cedente));
    }

    @Override
    public void construirNossoNumero(String nossoNumero) {
        boleto.setNossoNumero(new NossoNumeroBradesco(nossoNumero));
    }
    
    
}
