package cz.microshop.catalog.repository;

import cz.microshop.catalog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface IProductRepository extends MongoRepository<Product, Long> {
}
