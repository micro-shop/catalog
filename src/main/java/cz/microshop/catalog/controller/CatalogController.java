package cz.microshop.catalog.controller;

import cz.microshop.catalog.model.Catalog;
import cz.microshop.catalog.service.CatalogService;
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
@RequestMapping("/catalog")
public class CatalogController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    CatalogService catalogService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<ArrayList<Catalog>> createOrder(@RequestBody ArrayList<Catalog> catalogList)   {
        return new ResponseEntity<ArrayList<Catalog>>((ArrayList<Catalog>) catalogService.create(catalogList), HttpStatus.OK);

    }

}
