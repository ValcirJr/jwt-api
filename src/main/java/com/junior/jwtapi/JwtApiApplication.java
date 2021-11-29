package com.junior.jwtapi;

import com.junior.jwtapi.domain.Role;
import com.junior.jwtapi.domain.User;
import com.junior.jwtapi.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtApiApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
          userService.saveRole(new Role(null, "ROLE_USER"));
          userService.saveRole(new Role(null, "ROLE_MANAGER"));
          userService.saveRole(new Role(null, "ROLE_ADMIN"));
          userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

          userService.saveUser(new User(null, "Eddie Murphy", "eddie", "1234", new ArrayList<>()));
          userService.saveUser(new User(null, "Tom Holland", "tom", "1234", new ArrayList<>()));
          userService.saveUser(new User(null, "Tobey Maguire", "tobey", "1234", new ArrayList<>()));
          userService.saveUser(new User(null, "Andrew Garfield", "andrew", "1234", new ArrayList<>()));

          userService.addRoleToUser("eddie", "ROLE_USER");
          userService.addRoleToUser("eddie", "ROLE_MANAGER");
          userService.addRoleToUser("tom", "ROLE_USER");
          userService.addRoleToUser("tobey", "ROLE_ADMIN");
          userService.addRoleToUser("tobey", "ROLE_SUPER_ADMIN");
          userService.addRoleToUser("andrew", "ROLE_USER");
          userService.addRoleToUser("andrew", "ROLE_MANAGER");
        };
    }
}
