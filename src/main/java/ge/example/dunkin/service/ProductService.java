package ge.example.dunkin.service;

import ge.example.dunkin.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProduct();

    Product getProduct(Integer type);

    Product addProduct(Product product);


    List<Product> filter(Integer typeId, Integer quantity, Double minSinglePrice, Double maxSinglePrice);


    boolean  Dist(Double singlePrise, Integer id);
}
