package ge.example.dunkin.controller;

import ge.example.dunkin.model.Product;
import ge.example.dunkin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
@CrossOrigin("http://localhost:3000/")
public class ProductController {
    ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("all")
    public List<Product> allProd(){
        List<Product> prod=new ArrayList<>();
        Product product=new Product();
        product.setId(1);
        product.setSinglePrise(15.2);
        prod.add(product);
        return prod;
    }

    @GetMapping
    public List<Product> filter(@RequestParam(required = false) Integer typeId, @RequestParam(required = false) Integer quantity, @RequestParam(required = false) Double minSinglePrice, @RequestParam(required = false) Double maxSinglePrice) {
        return productService.filter(typeId,quantity,minSinglePrice,maxSinglePrice);
    }
}
