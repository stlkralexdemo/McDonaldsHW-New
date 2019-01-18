package ru.itpark.webstore.service;

import org.springframework.stereotype.Service;
import ru.itpark.webstore.domain.Product;
import ru.itpark.webstore.exception.ProductNotFoundException;
import ru.itpark.webstore.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getById(int id) {
        return repository.getById(id)
                .orElseThrow(ProductNotFoundException::new);
    }

    public Product getByIdOrEmpty(int id) {
//        if (id == 0) {
//            return repository.getById(id)
//                    .orElse(new Product());
//        }
//
//        return getById(id);
        return repository.getById(id)
                    .orElse(new Product());
    }

    public void save(Product item) {
        repository.save(item);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public List<Product> getByName(String name) {
        return repository.getByName(name);
    }

    public Product getByIdOrEmpty(String name) {
        return repository.getByName(name).stream().findFirst()
                .orElse(new Product());
    }
}
