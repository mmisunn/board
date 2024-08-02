package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.User;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void inserUser(){
        IntStream.rangeClosed(11,20).forEach(i->{
            User user = User.builder()
                    .userId("userid"+i)
                    .userPw("userpw"+i)
                    .userNumber((long)i)
                    .userName("사용자이름"+i)
                    .userImageFile("파일경로랑이름"+i)
                    .userDept("부서"+i)
                    .userTeam("팀"+i)
                    .userRank("직급"+i)
                    .userEmail("userid"+i+"@aaa.com")
                    .userStatus("재직")
                    .userBirth(LocalDateTime.now())
                    .userTel("010-0000-00"+i)
                    .build();
            userRepository.save(user);
        });
    }
}
