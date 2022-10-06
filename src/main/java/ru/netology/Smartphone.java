package ru.netology;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone (int id, String name, int coast, String manufacturer) {
        super(id, name, coast);
        this.manufacturer = manufacturer;
    }

}
