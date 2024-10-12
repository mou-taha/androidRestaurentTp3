package com.example.models;
public class Dish {
    private String name;
    private String description;
    private String price;

    private String categorie;

    public Dish(String name, String description, String price,String categorie) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categorie=categorie;
    }

    // Getter methods
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public String getCatgorie() { return categorie; }

}
