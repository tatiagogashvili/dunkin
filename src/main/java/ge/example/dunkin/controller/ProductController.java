package ge.example.dunkin.controller;

import ge.example.dunkin.model.Product;
import ge.example.dunkin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<Product> filter(@RequestParam(required = false) Integer typeId, @RequestParam(required = false) Integer quantity, @RequestParam(required = false) Double minSinglePrice, @RequestParam(required = false) Double maxSinglePrice) {
        return productService.filter(typeId,quantity,minSinglePrice,maxSinglePrice);
    }
}
