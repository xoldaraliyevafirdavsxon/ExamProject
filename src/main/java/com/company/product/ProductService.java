package com.company.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private long id=1;

    public List<Product> getAllProducts() {
        return productRepository.productList;
    }

    public Product getProductById(int id) {
        return productRepository.productList.get(id);
    }

    public Product addProduct(String name, double price) {
        Product product = new Product();
        product.setId(id++);
        product.setName(name);
        product.setPrice(price);
        productRepository.productList.add(product);
        return product;
    }

    public Product update(long id, String name){
        for (Product product : productRepository.productList){
            if (product.getId() == id){
                product.setName(name);
            }
            throw new RuntimeException("Product not found!!!");
        }

        throw new RuntimeException("Product not found!!!");
    }

    public Product delete(long id){
        for (Product product : productRepository.productList){
            if (product.getId() == id){
                productRepository.productList.remove(product);
            }
            throw new RuntimeException("Product not found!!!");
        }

        throw new RuntimeException("Product not found!!!");
    }

}

