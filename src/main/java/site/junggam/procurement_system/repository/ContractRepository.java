package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
