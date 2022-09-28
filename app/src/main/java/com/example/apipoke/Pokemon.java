package com.example.apipoke;

public class Pokemon {

    private String name;
    private int weight;
    private int height;
    private String image;
    private String setDetailsUrl;

    public Pokemon(String name, int weight, int height, String image) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", image='" + image + '\'' +
                '}';
    }
}
