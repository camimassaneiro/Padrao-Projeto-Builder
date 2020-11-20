
package builder;

import produto.NossoNumero;

/**
 *
 * @author camil
 */
public class NossoNumeroBradesco extends NossoNumero{

    private String nossoNumero;

    public NossoNumeroBradesco(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String toString() {
        return nossoNumero;
    }
    
    
}
