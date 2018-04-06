package cz.microshop.catalog.dao;

import cz.microshop.catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

	@Query(value="from Product p WHERE p.category.id = ?1 AND p.quantity > 0",
			countQuery="SELECT COUNT(p) FROM Product p WHERE p.category.id = ?1 AND p.quantity > 0", nativeQuery=false)
	List<Product> findByCategoryId(Long categoryId);
	
	@Query(value="from Product p WHERE p.quantity > 0 AND (p.description LIKE %?1% OR p.name LIKE %?1%)",
			countQuery="SELECT COUNT(p) FROM Product p WHERE p.quantity > 0 AND (p.description LIKE %?1% OR p.name LIKE %?1%)", nativeQuery=false)
	List<Product> findByTerm(String searchTerm);
	
}
