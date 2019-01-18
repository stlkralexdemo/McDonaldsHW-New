//package ru.itpark.webstore.repository;
//
//import org.springframework.stereotype.Repository;
//import ru.itpark.webstore.domain.Product;
//import ru.itpark.webstore.exception.ProductNotFoundException;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
////@Repository (одновремнно два репозитория делать не нужно)
//public class ProductRepositoryInMemoryImpl implements ProductRepository {
//    private final List<Product> items
//            = new ArrayList<>();
//    private int nextId = 1;
//
//    @Override
//    public List<Product> getAll() {
//        return items;
//    }
//
//    @Override
//    public Optional<Product> getById(int id) {
//        return items.stream()
//                .filter(o -> o.getId() == id)
//                .findFirst();
//    }
//
//    @Override
//    public void save(Product item) {
//        if (item.getId() == 0) {
//            // добавление
//            item.setId(nextId++);
//            items.add(item);
//            return;
//        }
//
//        Product product = getById(item.getId())
//                .orElseThrow(ProductNotFoundException::new);
//
//        product.setName(item.getName());
//        product.setPrice(item.getPrice());
//    }
//
//    @Override
//    public void removeById(int id) {
//        items.removeIf(o -> o.getId() == id); // lambda
//    }
//}
