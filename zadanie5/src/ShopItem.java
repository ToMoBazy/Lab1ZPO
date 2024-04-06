

import java.math.BigDecimal;
import java.util.Objects;

public class ShopItem {

    TaxStrategy taxStrategy;

    String name;

    BigDecimal price;

    public ShopItem() {
        taxStrategy = new TaxInPoland();
        name = "default";
        price = BigDecimal.ONE;
    }

    public ShopItem(TaxStrategy aTaxStrategy, String aName, BigDecimal aPrice) {
        taxStrategy = aTaxStrategy;
        name = aName;
        price = aPrice;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }

    void setTaxStrategy(TaxStrategy aTaxStrategy) {
        taxStrategy = aTaxStrategy;
    }

    public String getName() {
        return name;
    }

    void setName(String aName) {
        name = aName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    void setPrice(BigDecimal aPrice) {
        price = aPrice;
    }

    public BigDecimal calculateTax(){
        return taxStrategy.calculateTax(this.price);
    }

    public BigDecimal calculateTaxFull(){

        BigDecimal result = new BigDecimal(String.valueOf(taxStrategy.calculateTax(this.price).add(getPrice())));
        return result;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        ShopItem shopItem = (ShopItem) aO;
        return Objects.equals(name, shopItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "taxStrategy=" + taxStrategy +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
