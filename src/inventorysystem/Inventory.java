package inventorysystem;

import javafx.collections.ObservableList;

public class Inventory {
    private static ObservableList<Part> allParts;
    private static ObservableList<Product> allProducts;

    //Methods that interact with the lists

    //Add part to list of parts
    public static void addPart(Part part) {
        allParts.add(part);
    }

    //Add product to list of products
    public static void addProduct(Product product) {
        allProducts.add(product);
    }

    //Lookup part by id
    public static Part lookupPart(int partId) {
        return allParts.get(partId);
    }

    //Lookup part by name
    public static ObservableList<Part> lookupPart(String partName) {
        return allParts.filtered(p -> p.getName().contains(partName));
    }

    //Lookup product by id
    public static Product lookupProduct(int productId) {
        return allProducts.get(productId);
    }

    //Lookup part by name
    public static ObservableList<Product> lookupProduct(String productName) {
        return allProducts.filtered(p -> p.getName().contains(productName));
    }

    //Update part in list
    public static void updatePart(int index, Part part) {
        allParts.set(index, part);
    }

    //Update product in list
    public static void updateProduct(int index, Product product) {
        allProducts.set(index, product);
    }

    //Delete part in list
    public static void deletePart(Part part) {
        allParts.remove(part);
    }

    //Delete product in list
    public static void deleteProduct(Product product) {
        allProducts.remove(product);
    }

    //Get all of the parts
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    //Get all of the products
    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}