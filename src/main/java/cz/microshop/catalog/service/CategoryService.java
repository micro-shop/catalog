package cz.microshop.catalog.service;

import cz.microshop.catalog.dao.CategoryDao;
import cz.microshop.catalog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}
