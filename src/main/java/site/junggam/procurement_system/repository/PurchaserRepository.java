package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Purchaser;

public interface PurchaserRepository extends JpaRepository<Purchaser,String> {
}
