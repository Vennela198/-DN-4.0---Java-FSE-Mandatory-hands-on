package pkg;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Backpack", "Accessories")
        };

        Product result1 = SearchUtil.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchUtil.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
