package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
}
