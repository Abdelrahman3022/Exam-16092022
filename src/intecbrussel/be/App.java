package intecbrussel.be;
import intecbrussel.be.Product;
import intecbrussel.be.ProductFactory;
import intecbrussel.be.ElectricProduct;
import intecbrussel.be.HealthProduct;
import intecbrussel.be.FoodProduct;
import intecbrussel.be.ProductSorter;

public class App {




    public static void main(String[] args) {

        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory();
    FoodProduct foodProduct = new FoodProduct();
    HealthProduct healthProduct = new HealthProduct();
    HealthProduct electricProduct = new HealthProduct();
    Product product = new Product();
   try {


   } catch (Exception e) {
       e.printStackTrace();
   }


        product.add(new Product());

        System.out.println(foodProduct);
        System.out.println(healthProduct);
        System.out.println(electricProduct);
        System.out.println(product);


    }

   }

