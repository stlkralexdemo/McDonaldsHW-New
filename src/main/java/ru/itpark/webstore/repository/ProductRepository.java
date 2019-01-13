package ru.itpark.webstore.repository;

import org.springframework.stereotype.Repository;
import ru.itpark.webstore.domain.Product;
import ru.itpark.webstore.exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final List<Product> items
            = new ArrayList<>();
    private int nextId = 1;

    public List<Product> getAll() {
        return items;
    }

    public Optional<Product> getById(int id) {
        return items.stream()
                .filter(o -> o.getId() == id)
                .findFirst();
    }

    public void save(Product item) {
        if (item.getId() == 0) {
            // добавление
            item.setId(nextId++);
            items.add(item);
            return;
        }

        Product product = getById(item.getId())
                .orElseThrow(ProductNotFoundException::new);

        product.setName(item.getName());
        product.setPrice(item.getPrice());
    }

    public void removeById(int id) {
        items.removeIf(o -> o.getId() == id); // lambda
    }
}
