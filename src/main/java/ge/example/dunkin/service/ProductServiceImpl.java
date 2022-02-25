package ge.example.dunkin.service;


import ge.example.dunkin.model.Product;
import ge.example.dunkin.repository.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.List;

@Service
public  class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.getById(id);

    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> filter(Integer typeId, Integer quantity, Double minSinglePrice, Double maxSinglePrice) {
        return productRepository.
                findAll(

                ((root, query, cb) ->{
                    Predicate predicate = cb.conjunction();
                    if(typeId!=null){
                        predicate=cb.and(predicate,cb.equal(root.get("typeId"),typeId));
                    }
                    if(quantity!=null){
                        predicate=cb.and(predicate,cb.equal(root.get("quantity"),quantity));
                    }
                    if(minSinglePrice!=null){
                        predicate=cb.and(predicate,cb.greaterThanOrEqualTo(root.get("singlePrise"),minSinglePrice));
                    }
                    if(maxSinglePrice!=null){
                        predicate=cb.and(predicate,cb.lessThanOrEqualTo(root.get("singlePrise"),maxSinglePrice));
                    }
                    return predicate;
                }));
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public  boolean Dist(Double singlePrise, Integer id) {
        Product product = new Product();
        product = getProduct(id);
        if (product.getSinglePrise() - singlePrise < 0) {
            return false;
        }
        product.setSinglePrise(product.getSinglePrise() - singlePrise);
        addProduct(product);
        return true;
    }

}
