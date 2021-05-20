//package com.barbershop.controller.security;
//import com.barbershop.entity.security.AuthorityEntity;
//import com.barbershop.entity.security.BasicAuthResponseModel;
//import com.barbershop.entity.security.UserEntity;
//import com.barbershop.repository.security.AuthorityRepository;
//import com.barbershop.repository.security.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/api")
//public class AuthRestController {
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AuthorityRepository authorityRepository;
//
//    @GetMapping("/login")
//    public BasicAuthResponseModel confirmBasicAuthConfig(){
//        return new BasicAuthResponseModel("Success");
//    }
//
//    @PostMapping("/register")
//    public UserEntity registerUser(@RequestBody UserEntity userEntity){
//
//        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
//        userEntity.setEnabled(true);
//        userRepository.save(userEntity);
//
//        AuthorityEntity authorityEntity =new AuthorityEntity();
//        authorityEntity.setUsername(userEntity.getUsername());
//        authorityEntity.setAuthority("USER");
//        authorityEntity.setUser(userEntity);
//        authorityRepository.save(authorityEntity);
//        return userEntity;
//
//    }
//
//
//}
