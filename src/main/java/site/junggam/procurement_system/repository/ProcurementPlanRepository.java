package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.ProcurementPlan;

public interface ProcurementPlanRepository extends JpaRepository<ProcurementPlan, String> {
}
