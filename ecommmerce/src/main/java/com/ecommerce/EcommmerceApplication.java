package com.ecommerce;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.config.SecurityUtility;
import com.ecommerce.domain.security.Role;
import com.ecommerce.domain.security.User;
import com.ecommerce.domain.security.UserRole;
import com.ecommerce.service.UserService;

@SpringBootApplication
public class EcommmerceApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(EcommmerceApplication.class, args);
		
	}
//@Override
public void run(String... args) throws Exception{
	User user1 = new User();
	user1.setFirstName("Abhi");
	user1.setLastName("walia");
	user1.setUsername("abhinav80");
	user1.setPassword(SecurityUtility.passwordEncoder().encode("abhi123"));
	user1.setEmail("waliadeepak80@gmail.com");
	Set<UserRole> userRoles = new HashSet<>();
	Role role1= new Role();
	role1.setRoleId(1);
	role1.setName("ROLE_USER");
	userRoles.add(new UserRole(user1,role1));
	userService.createUser(user1,userRoles);
	userRoles.clear();
	
	
	User user2 = new User();
	user2.setFirstName("Admin");
	user2.setLastName("Admin");
	user2.setUsername("Admin");
	user2.setPassword(SecurityUtility.passwordEncoder().encode("abhi123"));
	user2.setEmail("admin@gmail.com");
	//Set<UserRole> userRoles = new HashSet<>();
	Role role2= new Role();
	role2.setRoleId(0);
	role2.setName("ROLE_ADMIN");
	userRoles.add(new UserRole(user2,role2));
	userService.createUser(user2,userRoles);
	userRoles.clear();
}
}
