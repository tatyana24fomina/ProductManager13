package ru.netology.ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();

    Product Book1 = new Book(11, "Оно", 996, "Cт.Кинг");
    Product Book2 = new Book(12, "Игра Джералда", 766, "Cт.Кинг");
    Product Smartphone1 = new Smartphone(01, "IPhone10", 50000, "Apple");
    Product Smartphone2 = new Smartphone(02, "IPhone11", 55000, "Apple");

    @Test
    void shouldFindAll() {
        repository.save(Book1);
        repository.save(Book2);
        repository.save(Smartphone1);

        Product[] expected = {Book1, Book2, Smartphone1};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave() {
        repository.save(Book1);
        Product[] actual = repository.findAll();
        Product[] expected = {Book1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        repository.save(Book1);
        repository.save(Smartphone1);
        repository.removeById(01);

        Product[] expected = {Book1};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
