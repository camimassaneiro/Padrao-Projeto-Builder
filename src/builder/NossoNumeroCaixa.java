package builder;

import produto.NossoNumero;

/**
 *
 * @author camil
 */
public class NossoNumeroCaixa extends NossoNumero{
    
    private String nossoNumero;

    public NossoNumeroCaixa(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String toString() {
        return nossoNumero;
    }
    
    
}
