package ru.netology;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int coast, String author) {
        super(id, name, coast);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

