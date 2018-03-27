package cz.microshop.cart.repository;

import cz.microshop.cart.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface IProductRepository extends MongoRepository<Product, UUID> {
}
