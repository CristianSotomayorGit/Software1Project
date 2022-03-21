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

    public static void addProduct(Product newProduct) {
        allProducts = FXCollections.observableArrayList();
        allProducts.add(newProduct);
    }

    public static Product lookupProduct(int productId) {
        return allProducts.get(productId);
    }

    public static Part lookupPart(int partId) {
        return allParts.get(partId);
    }

    public static void updatePart(int index, Part selectedPart) {

    }

    public static void updateProduct(int index, Product newProduct) {

    }

    public static boolean deletePart(Part selectedPart) {
        allParts = FXCollections.observableArrayList();
        allParts.remove(selectedPart);
        return true;
    }

    public static boolean deleteProduct(Product selectedProduct) {
        allProducts = FXCollections.observableArrayList();
        allProducts.remove(selectedProduct);
        return true;
    }

    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    public ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}