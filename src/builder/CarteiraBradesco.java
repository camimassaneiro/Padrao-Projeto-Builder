package builder;

import produto.Boleto;
import produto.Carteira;

/**
 *
 * @author camil
 */
public class CarteiraBradesco extends Carteira {
    
    private String carteira;

    public CarteiraBradesco(String carteira) {
        this.carteira = carteira;
    }

    @Override
    public String toString() {
        return carteira;
    }

    
}
