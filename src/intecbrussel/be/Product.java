package intecbrussel.be;


public class Product implements Comparable<Product>{

private String name;
public intecbrussel.be.Product productID;
    private Object Product;

    public Product() {
        this.name = name;
    }


    public Product(intecbrussel.be.Product productID) {
        this.productID = productID;
    }




    @Override
    public int compareTo(Product o) {
        return 0;
    }

     {

    }

    public void add(intecbrussel.be.Product product) {if (Product == null) {
        this.productID = new Product();
    } else {
        productID.add(new Product());
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public intecbrussel.be.Product getProductID() {
        return productID;
    }

    public void setProductID(intecbrussel.be.Product productID) {
        this.productID = productID;
    }

    public Object getProduct() {
        return Product;
    }

    public void setProduct(Object product) {
        Product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                ", Product=" + Product +
                '}';
    }
}
