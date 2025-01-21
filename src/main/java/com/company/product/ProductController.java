package com.company.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping

public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products/{name}/{price}")
    public Product addProduct(@PathVariable String name, @PathVariable double price) {
        return productService.addProduct(name,price);
    }

    @PutMapping("/products/{id}/{name}")
    public Product updateProduct(@PathVariable int id, @PathVariable String name) {
        return productService.update(id,name);
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.delete(id);
    }




}
