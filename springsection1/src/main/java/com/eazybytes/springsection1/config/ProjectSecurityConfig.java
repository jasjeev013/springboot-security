package com.eazybytes.springsection1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;

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

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 =  User.withUsername("jasjeev")
                .password("{bcrypt}$2a$10$9Okk7uC52Rwq99G8Vq0mlec7xOZkze8QJr8iqunf1MSHFkFbLzkCG") //jasjeev123
                .authorities("read")
                .build();

        UserDetails user2 =  User.withUsername("rohan")
                .password("{noop}Rohan@123")
                .authorities("admin")
                .build();

        return new InMemoryUserDetailsManager(user1,user2);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder(); // Taking Default Or Spring Recommended Password Encoder
    }

    public CompromisedPasswordChecker compromisedPasswordChecker(){
        return new HaveIBeenPwnedRestApiPasswordChecker();
    }
}
