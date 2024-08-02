package site.junggam.procurement_system.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Log4j2
@EnableWebSecurity
@Configuration
public class SecurityConfig { //p.479 시큐리티 설정 클래스임

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        log.info("필터체인");
        http.authorizeHttpRequests(auth -> {
            auth.anyRequest().permitAll(); //모든 페이지 로그인 없이 들어갈 수 있게 우선 설정함

        });

        http.formLogin(Customizer.withDefaults()); // p.497  기본 로그인 페이지 사용
        // 우리가 원하는 디자인의 로그인폼을 사용하기 위해서는 formLogin()말고 loginPage()등을 이용
        http.csrf(csrf -> csrf.disable()); //p.500  csrf토큰 비활성화
        //보안관련 기능인데 나 설명 봐도 잘 모르겠음
        //이걸 주석처리해서 활성화를 시키면 get방식으로도 로그아웃처리가 됨
        http.logout(Customizer.withDefaults()); //p501 기본 로그아웃 설정 사용
        //로그인과 마찬가지로 디자인의 로그인폼을 바꿀 수 있음


        return http.build();
    }

}
