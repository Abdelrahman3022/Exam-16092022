package intecbrussel.be;

import java.util.Arrays;

public class FoodProduct extends ProductFactory{


    private static final ProductSorter productSorter = null;
    private static final Object Product = productSorter;

    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};



    public FoodProduct() {
        super(Product);
    }


    public String[] getFoodProducts() {
        return foodProducts;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "foodProducts=" + Arrays.toString(foodProducts) +
                '}';
    }
}
