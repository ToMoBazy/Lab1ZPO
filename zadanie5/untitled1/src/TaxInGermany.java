

import java.math.BigDecimal;

public class TaxInGermany implements TaxStrategy{

    private static BigDecimal taxRate = BigDecimal.valueOf(0.20);
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(taxRate);
    }
}
