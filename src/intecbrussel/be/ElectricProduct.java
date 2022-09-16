package intecbrussel.be;

import java.util.Arrays;

public class ElectricProduct extends ProductFactory{


    public ElectricProduct(ProductSorter productSorter, String healthProducts) {
        super(productSorter, healthProducts);
    }

    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};
    public ElectricProduct(String productSorter, String[] healthProducts) {
        super(productSorter, healthProducts);
    }

    @Override
    public String toString() {
        return "ElectricProduct{" +
                "electricProducts=" + Arrays.toString(electricProducts) +
                '}';
    }
}
