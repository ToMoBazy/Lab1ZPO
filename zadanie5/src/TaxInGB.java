

import java.math.BigDecimal;

public class TaxInGB implements TaxStrategy{

    private static BigDecimal taxRate = BigDecimal.valueOf(0.30);

    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(taxRate);
    }
}
