import java.math.BigDecimal;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ShopItem> items = new ArrayList<>();

        items.add(new ShopItem());
        items.add(new ShopItem(new TaxInGermany(), "lody", BigDecimal.valueOf(10)));
        items.add(new ShopItem());
        items.add(new ShopItem(new TaxInPoland(), "lody", BigDecimal.valueOf(10)));
        items.add(new ShopItem(new TaxInGB(), "lody", BigDecimal.valueOf(10)));

        for(ShopItem item: items){
            System.out.println("Item No." + items.indexOf(item));
            System.out.println(item);
            System.out.println("Tax is equal to: " + item.calculateTax());
            System.out.println("Full Price: " + item.calculateTaxFull());
        }
    }
}