package intecbrussel.be;

import java.util.Arrays;

public class HealthProduct extends ProductFactory{


    public HealthProduct(String productSorter, String[] healthProducts) {
        super(productSorter, healthProducts);
    }
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    public HealthProduct() {
        super();
    }

    @Override
    public String[] getHealthProducts() {
        return healthProducts;
    }

    @Override
    public String toString() {
        return "HealthProduct{" +
                "healthProducts=" + Arrays.toString(healthProducts) +
                '}';
    }
}
