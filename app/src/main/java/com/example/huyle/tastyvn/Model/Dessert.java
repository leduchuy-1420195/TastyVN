package com.example.huyle.tastyvn.Model;

public class Dessert {
    private String Name, Image, Description, Price;

    public Dessert() {
    }

    public Dessert(String name, String image, String description, String price) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
