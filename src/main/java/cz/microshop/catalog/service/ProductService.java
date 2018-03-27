package cz.microshop.catalog.service;

import cz.microshop.catalog.model.Product;
import cz.microshop.catalog.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> create(List<Product> list) {
        return productRepository.saveAll(list);
    }
}
