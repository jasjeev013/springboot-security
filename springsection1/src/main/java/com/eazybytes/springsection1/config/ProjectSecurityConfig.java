package com.eazybytes.springsection1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests(requests ->  requests.anyRequest().permitAll());
//        http.authorizeHttpRequests(requests ->  requests.anyRequest().denyAll());
        http.authorizeHttpRequests(requests ->  requests.requestMatchers("/myAccount","/myBalance","/myCards").authenticated()
                .requestMatchers("/notices","/contact","/error").permitAll());
//        http.formLogin(flc -> flc.disable()); // The form will appear
//        http.httpBasic(hbc -> hbc.disable()); // The alert box will appear
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }

}
