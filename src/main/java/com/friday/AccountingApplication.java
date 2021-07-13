package com.friday;

import com.friday.entity.Company;
import com.friday.entity.Role;
import com.friday.entity.User;
import com.friday.enums.Status;
import com.friday.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AccountingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountingApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
@Bean
@Transactional
public CommandLineRunner mappingDemo(RoleRepository roleRepository, UserRepository userRepository, CompanyRepository companyRepository, CategoryRepository categoryRepository, ProductRepository productRepository, InvoiceNumberRepository invoiceNumberRepository, InvoiceRepository invoiceRepository, InvoiceProductRepository invoiceProductRepository
)
{
    return args -> {
        //Create Roles
        Role roleRoot     = new Role("ROOT");
        Role roleAdmin    = new Role("ADMIN");
        Role roleManager  = new Role("MANAGER");
        Role roleEmployee = new Role("EMPLOYEE");
        roleRepository.save(roleRoot);
        roleRepository.save(roleAdmin);
        roleRepository.save(roleManager);
        roleRepository.save(roleEmployee);
        //Create Root Company & Users
        Company companyRoot = new Company("CyberTek LLC","address1","address2","OH","75074","rep","email@email.com", LocalDate.now(),true, Status.ACTIVE);
        companyRepository.save(companyRoot);
        User userRoot = new User("Mehmet","Kara","mehmetkara@gmail.com" , true, "+1954784236",
                "$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK",companyRoot);
        userRoot.addRole(roleRoot);
        userRepository.save(userRoot);








    };
}

}
