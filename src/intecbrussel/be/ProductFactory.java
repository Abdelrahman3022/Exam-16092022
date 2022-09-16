package intecbrussel.be;
import java.util.Arrays;
import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorteren;

    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};



    public ProductFactory(String productSorter, String[] healthProducts) {
    }

    public ProductFactory() {

    }

    public ProductFactory(ProductSorter productSorter, String healthProducts) {

    }

    public ProductFactory(Object product) {

    }

    public void createProducts(int amount)
    {
        Random r= new Random();
        for(int i =1;i<=amount;i++)
        {

            int productType= r.nextInt(1);
            int productID= r.nextInt(150);
            if(productType==0)
                productSorteren.getFoodProducts(new FoodProduct());


        }
    }

    public ProductSorter getProductSorteren() {
        return productSorteren;
    }

    public void setProductSorteren(ProductSorter productSorteren) {
        this.productSorteren = productSorteren;
    }

    public String[] getFoodProducts() {
        return foodProducts;
    }

    public void setFoodProducts(String[] foodProducts) {
        this.foodProducts = foodProducts;
    }

    public String[] getHealthProducts() {
        return healthProducts;
    }

    public void setHealthProducts(String[] healthProducts) {
        this.healthProducts = healthProducts;
    }

    public String[] getElectricProducts() {
        return electricProducts;
    }

    public void setElectricProducts(String[] electricProducts) {
        this.electricProducts = electricProducts;
    }

    @Override
    public String toString() {
        return "ProductFactory{" +
                "productSorteren=" + productSorteren +
                ", foodProducts=" + Arrays.toString(foodProducts) +
                ", healthProducts=" + Arrays.toString(healthProducts) +
                ", electricProducts=" + Arrays.toString(electricProducts) +
                '}';
    }
}











