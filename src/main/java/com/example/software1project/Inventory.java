package com.example.software1project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Inventory {

    private static ObservableList<Part> allParts = FXCollections.observableArrayList();


    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();

    public static void addPart(Part newPart) {
        allParts = FXCollections.observableArrayList();
        allParts.add(newPart);
    }

    public static boolean deletePart(Part selectedPart) {
        allParts = FXCollections.observableArrayList();
        allParts.remove(selectedPart);
        return true;
    }


    public static void addProduct(Product newProduct) {
        allProducts = FXCollections.observableArrayList();
        allProducts.add(newProduct);
    }

    public static boolean deleteProduct(Product selectedProduct) {
        allProducts = FXCollections.observableArrayList();
        allProducts.remove(selectedProduct);
        return true;
    }

    public static Part lookupPart(int partId) {
        Part part;
        part = new Part(partId, "oop", 12, 5, 1, 10);
        return part;
    }

    public static Product lookupProduct(int productId) {
        return new Product();
    }

    public static Part lookupPart(String partName) {
        return new Part(1, "oop", 12, 5, 1, 10);
    }

    public static Product lookupProduct(String productName) {
        return new Product();
    }

    public static void updatePart(int index, Part selectedPart) {

    }

    public static void updateProduct(int index, Product newProduct) {

    }

    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    public ObservableList<Product> getAllProducts() {
        return allProducts;
    }

    Part
    public Integer getId() {
        Part part = new Part(int id, name String, double price, int stock, int min, int max);
        return part.getId();


    }
}