
package builder;

import produto.Carteira;

/**
 *
 * @author camil
 */
public class CarteiraCaixa extends Carteira{

    private String carteira;

    public CarteiraCaixa(String carteira) {
        this.carteira = carteira;
    }

    @Override
    public String toString() {
        return carteira;
    }    
}
