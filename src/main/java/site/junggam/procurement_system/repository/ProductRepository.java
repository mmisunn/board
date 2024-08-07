package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
