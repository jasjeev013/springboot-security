package com.eazybytes.springsection1.controllers;

import com.eazybytes.springsection1.Repository.CustomerRepository;
import com.eazybytes.springsection1.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private CustomerRepository customerRepository;
    private PasswordEncoder passwordEncoder;

    public UserController(CustomerRepository customerRepository, PasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        try {
            String hashPwd  = passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashPwd);
            Customer customer1 = customerRepository.save(customer);
            if (customer1.getId()>0){
                return ResponseEntity.status(HttpStatus.CREATED).body("Customer Created");
            }else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Registration Failed");
            }

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception Occurred" + e.getMessage());
        }
    }
}
