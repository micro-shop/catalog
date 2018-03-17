package cz.microshop.catalog.repository;

import cz.microshop.catalog.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface ICatalogRepository extends MongoRepository<Catalog, UUID> {
}
