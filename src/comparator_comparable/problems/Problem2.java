//Problem 2: Sorting Products by Custom Criteria
//
//You have a Product class with fields: id, name, and price.
//
//Task:
//
//Sort the products by price in ascending order.
//Write another Comparator to sort by name length in descending order.
//Example Input:
//
//List<Product> products = Arrays.asList(
//        new Product(1, "Laptop", 800),
//        new Product(2, "Phone", 500),
//        new Product(3, "Television", 700)
//);
//Expected Output (By Price):
//
//Product{id=2, name='Phone', price=500}
//Product{id=3, name='Television', price=700}
//Product{id=1, name='Laptop', price=800}
//Expected Output (By Name Length):
//
//Product{id=3, name='Television', price=700}
//Product{id=1, name='Laptop', price=800}
//Product{id=2, name='Phone', price=500}


package comparator_comparable.problems;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product(116L, "Earphone", 99.8D),
                new Product(161L, "Watch", 199.0D),
                new Product(611L, "Phone", 599.00D),
                new Product(982L, "Laptop", 999.99D)
        );
        List<Product> products = Arrays.asList(
                new Product(1L, "Laptop", 800D),
                new Product(2L, "Phone", 500D),
                new Product(3L, "Television", 700D)
        );

        Comparator<Product> priceComparator = (i, j) -> {
            if(i.price < j.price)
                return -1;
            return 1;
        };

        Comparator<Product> prodLengthComparator = (i, j) -> {
            if(i.name.length() > j.name.length())
                return -1;
            return 1;
        };
        Collections.sort(productList, prodLengthComparator);
        Collections.sort(products, priceComparator);
        System.out.println("----------Products By Longest Product Length---------------");
        System.out.println(productList);
        System.out.println("----------Products By Lowest Price---------------");
        System.out.println(products);

    }
}

class Product{
    Long id;
    String name;
    Double price;

    public Product() {
    }

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return STR."""
                { Name: \{this.name}
                Id: \{this.id}
                Price: \{this.price} }
               """;
    }
}