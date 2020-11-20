
package builder;

import produto.Cedente;

/**
 *
 * @author camil
 */
public class CedenteCaixa extends Cedente{
    
   private String cedente;

    public CedenteCaixa(String cedente) {
        this.cedente = cedente;
    }

    @Override
    public String toString() {
        return cedente;
    }
   
   
}
