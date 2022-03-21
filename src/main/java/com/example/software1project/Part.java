package com.example.software1project;

import javafx.beans.property.*;

public abstract class Part {
    private final IntegerProperty id;
    private final StringProperty name;
    private final DoubleProperty price;
    private final IntegerProperty stock;
    private final IntegerProperty max;
    private final IntegerProperty min;



    public Part(Integer id, String name, Double price, Integer stock, Integer max, Integer min) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleDoubleProperty(price);
        this.stock =  new SimpleIntegerProperty(stock);
        this.max = new SimpleIntegerProperty(max);
        this.min = new SimpleIntegerProperty(min);
    }

    //methods for manipulating id

    public IntegerProperty idProperty(){
        return id;
    }

    /**
     * @return the id
     */
    public final Integer getId() {
        return idProperty().get();
    }

    /**
     * @param id the id to set
     */
    public final void setId(Integer id) {
        idProperty().set(id);
    }

    //methods for manipulating name

    public StringProperty nameProperty(){
        return name;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return nameProperty().get();
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        nameProperty().set(name);
    }

    //methods for manipulating price
    public DoubleProperty priceProperty(){
        return price;
    }

    /**
     * @return the price
     */
    public final Double getPrice() {
        return priceProperty().get();
    }

    /**
     * @param price the price to set
     */
    public final void setPrice(Double price) {
        priceProperty().set(price);
    }

    //methods for manipulating stock

    public IntegerProperty stockProperty(){
        return stock;
    }

    /**
     * @return the stock
     */
    public final Integer getStock() {
        return stockProperty().get();
    }

    /**
     * @param stock the stock to set
     */
    public final void setStock(Integer stock) {
        stockProperty().set(stock);
    }

    //methods for manipulating max

    public IntegerProperty maxProperty(){
        return max;
    }

    /**
     * @return the stock
     */
    public final Integer getMax() {
        return maxProperty().get();
    }

    /**
     * @param max the max to set
     */
    public final void setMax(Integer max) {
        maxProperty().set(max);
    }

    //methods for manipulating min

    public IntegerProperty minProperty(){
        return min;
    }

    /**
     * @return the min
     */
    public final Integer getMin() {
        return minProperty().get();
    }

    /**
     * @param min the min to set
     */
    public final void setMin(Integer min) {
        minProperty().set(min);
    }
}