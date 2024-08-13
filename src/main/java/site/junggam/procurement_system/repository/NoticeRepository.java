package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {
}
