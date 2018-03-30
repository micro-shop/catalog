package cz.microshop.catalog.controller;

import cz.microshop.catalog.model.Category;
import cz.microshop.catalog.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public List<Category> getAll() {
        return categoryService.findAll();
    }

}
