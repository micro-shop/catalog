package cz.microshop.catalog.controller;

import cz.microshop.catalog.model.Product;
import cz.microshop.catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class CatalogController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<ArrayList<Product>> create(@RequestBody ArrayList<Product> productList)   {
        return new ResponseEntity<ArrayList<Product>>((ArrayList<Product>) productService.create(productList), HttpStatus.OK);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public Product findById(@RequestParam Long id) {
        return productService.findOne(id);
    }

    @RequestMapping(value = "/findByTerm", method = RequestMethod.GET, produces = "application/json")
    public Page<Product> getProductsByTerm(@RequestParam String searchTerm, @RequestParam Pageable pageable) {
        return productService.findByTerm(searchTerm, pageable);
    }

    @RequestMapping(value = "/findByCategory", method = RequestMethod.GET, produces = "application/json")
    public Page<Product> getProductsByTerm(@RequestParam Long categoryId, @RequestParam Pageable pageable) {
        return productService.findByCategoryId(categoryId, pageable);
    }

    @RequestMapping(value = "/getSixBest", method = RequestMethod.GET, produces = "application/json")
    public List<Product> getSixLatestProducts() {
        return null;
        //return productService.findByTerm("", new PageRequest(0, 6));
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    public Page<Product> getAllByPage(@RequestParam Pageable pageable) {
        return productService.findAllByPage(pageable);
    }

}
