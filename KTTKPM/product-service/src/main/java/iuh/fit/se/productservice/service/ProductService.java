package iuh.fit.se.productservice.service;

import iuh.fit.se.productservice.model.Product;

public interface ProductService {
    public Product findByID(Long id);
    public Product save(Product product);
}
