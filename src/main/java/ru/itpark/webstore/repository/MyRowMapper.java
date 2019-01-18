package ru.itpark.webstore.repository;

import org.springframework.jdbc.core.RowMapper;
import ru.itpark.webstore.domain.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int i) throws SQLException {
//        int id = rs.getInt("id");
//        String name = rs.getString("name");
//        int price = rs.getInt("price");
//        String imageUrl = rs.getString("imageUrl");


//        return new Product(id, name, price, imageUrl);
        return null;
    }
}
