package cz.microshop.catalog.service;

import cz.microshop.catalog.dao.ProductDao;
import cz.microshop.catalog.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public List<Product> create(List<Product> list) {
        return productDao.saveAll(list);
    }

    public Product findOne(Long id) {
        return productDao.findById(id).orElseGet(null);
    }

    public List<Product> findByTerm(String searchTerm) {
        return productDao.findByTerm(searchTerm);
    }

    public List<Product> findByCategoryId(Long categoryId) {
        return productDao.findByCategoryId(categoryId);
    }
}
