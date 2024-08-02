package site.junggam.procurement_system.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Log4j2
@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        log.info("필터체인까지 들어왔음");
        http.authorizeHttpRequests(auth ->{auth.anyRequest().permitAll();}); //모든 페이지 로그인 없이 들어가게 함
        return http.build();
    }
}
