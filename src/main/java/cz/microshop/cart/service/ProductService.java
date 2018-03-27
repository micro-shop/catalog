package cz.microshop.cart.service;

import cz.microshop.cart.model.Catalog;
import cz.microshop.cart.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository orderRepository;

    public List<Catalog> findAll() {
        return orderRepository.findAll();
    }

    public List<Catalog> create(List<Catalog> catalogList) {
        return orderRepository.saveAll(catalogList);
    }
}
