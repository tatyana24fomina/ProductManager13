package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Product Book1 = new Book(11, "Оно", 996, "Cт.Кинг");
    Product Book2 = new Book(12, "Игра Джералда", 766, "Cт.Кинг");
    Product Smartphone1 = new Smartphone(01, "IPhone10", 50000, "Apple");
    Product Smartphone2 = new Smartphone(02, "IPhone11", 55000, "Apple");

    @Test
    void shouldAdd() {
        manager.add(Book1);
        manager.add(Book2);
        manager.add(Smartphone1);
        Product[] expected = {Book1, Book2, Smartphone1};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBy() {
        manager.add(Book2);
        manager.add(Smartphone1);
        manager.add(Smartphone2);
        Product[] expected = {Smartphone1};
        Product[] actual = manager.searchBy("IPhone10");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldMatches() {
        boolean expected = true;
        boolean actual = manager.matches(Book1, "Оно");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMatchesNegative() {
        boolean expected = true;
        boolean actual = manager.matches(Book1, "Игра Джералда");

        Assertions.assertNotEquals(expected, actual);
    }

}
