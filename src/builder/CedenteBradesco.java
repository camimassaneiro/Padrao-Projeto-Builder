
package builder;

import produto.Cedente;

/**
 *
 * @author camil
 */
public class CedenteBradesco extends Cedente{

   private String cedente;

    public CedenteBradesco(String cedente) {
        this.cedente = cedente;
    } 

    @Override
    public String toString() {
        return cedente;
    }
    
    
}
