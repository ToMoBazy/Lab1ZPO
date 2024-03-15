

import java.math.BigDecimal;

public class TaxInPoland implements TaxStrategy{

    private static BigDecimal taxRate = BigDecimal.valueOf(0.23);
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(taxRate);
    }


}
