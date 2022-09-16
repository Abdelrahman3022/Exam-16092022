package intecbrussel.be;

import java.util.LinkedList;
import java.util.List;

public class ProductSorter {


    private List<Product> products = new LinkedList<>();
    private List<FoodProduct> foodProducts = new LinkedList<>();
    private List<HealthProduct> healthProducts = new LinkedList<>();
    private List<ElectricProduct> electricProducts = new LinkedList<>();

    public List<FoodProduct> getFoodProducts(FoodProduct foodProduct) {
        return foodProducts;
    }

  public List<HealthProduct> getHealthProducts() {
    return healthProducts;
  }

  public List<ElectricProduct> getElectricProducts() {
    return electricProducts;
  }

    public void setFoodProducts(List<FoodProduct> foodProducts) {
        this.foodProducts = foodProducts;
    }

    public void setHealthProducts(List<HealthProduct> healthProducts) {
        this.healthProducts = healthProducts;
    }

    public void setElectricProducts(List<ElectricProduct> electricProducts) {
        this.electricProducts = electricProducts;
    }

    @Override
    public String toString() {
        return "ProductSorter{" +
                "products=" + products +
                ", foodProducts=" + foodProducts +
                ", healthProducts=" + healthProducts +
                ", electricProducts=" + electricProducts +
                '}';
    }
}
