package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Warehousing;

public interface WarehousingRepository extends JpaRepository<Warehousing,String> {
}
