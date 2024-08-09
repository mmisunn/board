package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.Member;
import site.junggam.procurement_system.entity.MemberStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMember() {
        LocalDate date = LocalDate.of(1993, 4, 23);
        LocalDateTime dateTime = date.atStartOfDay();

        Member member = Member.builder().memberId("hong")
                .memberPw("3455").memberNumber(123456)
                .memberName("홍길동").memberImageFile("hong.png").memberDept("구매조달부")
                .memberTeam("구매팀").memberRank("사원").memberEmail("hong@buyer.com")
                .memberStatus(MemberStatus.ACTIVE).memberBirth(dateTime)
                .memberTel("010-5678-9876").build();
        memberRepository.save(member);
    }
}
