package optionalclass;


import java.util.Optional;

public class Product {
    private Long id;
    private String name;
    private Double price;
    public Product(){}
    public Product(Long id, String name, Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    private static Optional<Product> getProductById(Long id){
        Product product = new Product(1L, "Phone", 999.99);
        return Optional.ofNullable(product);
    }
    private static Optional<Product> getProductByIdNull(Long id){
        Product product1 = new Product();
        return Optional.ofNullable(product1);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nPrice: " + price;
    }
}
