package ru.itpark.webstore.repository;

import ru.itpark.webstore.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();

    Optional<Product> getById(int id);

    void save(Product item);

    void removeById(int id);
}
