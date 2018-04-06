package cz.microshop.catalog.service;

import cz.microshop.catalog.dao.ProductDao;
import cz.microshop.catalog.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Page<Product> findAllByPage(Pageable page) {
        return productDao.findAll(page);
    }

    public List<Product> create(List<Product> list) {
        return productDao.saveAll(list);
    }

    public Product findOne(Long id) {
        return productDao.findById(id).orElseGet(null);
    }

    public Page<Product> findByTerm(String searchTerm, Pageable page) {
        return productDao.findByTerm(searchTerm, page);
    }

    public Page<Product> findByCategoryId(Long categoryId, Pageable page) {
        return productDao.findByCategoryId(categoryId, page);
    }
}
