package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Order;

public interface OrderRepository extends JpaRepository<Order,String> {
}
