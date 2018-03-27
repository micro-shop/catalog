package cz.microshop.catalog.controller;

import cz.microshop.catalog.model.Product;
import cz.microshop.catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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

}
