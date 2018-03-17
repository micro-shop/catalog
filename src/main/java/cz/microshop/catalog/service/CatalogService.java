package cz.microshop.catalog.service;

import cz.microshop.catalog.model.Catalog;
import cz.microshop.catalog.repository.ICatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private ICatalogRepository orderRepository;

    public List<Catalog> findAll() {
        return orderRepository.findAll();
    }

    public List<Catalog> create(List<Catalog> catalogList) {
        return orderRepository.saveAll(catalogList);
    }
}
