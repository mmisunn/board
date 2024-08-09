package site.junggam.procurement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.junggam.procurement_system.entity.Member;

public interface MemberRepository  extends JpaRepository<Member,String> {
}
