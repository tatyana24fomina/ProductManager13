package ru.netology;

public class Product {
    protected int id;
    protected String name;
    protected int coast;

    public Product(int id, String name, int coast) {
        this.id = id;
        this.name = name;
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }
}


