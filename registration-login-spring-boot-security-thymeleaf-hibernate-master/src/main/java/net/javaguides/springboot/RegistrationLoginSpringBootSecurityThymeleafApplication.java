package net.javaguides.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.service.UserService;

@SpringBootApplication
public class RegistrationLoginSpringBootSecurityThymeleafApplication {

	
	  @Autowired private UserService userService;
	  
	  @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 
	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootSecurityThymeleafApplication.class, args);
	}
	
	/*
	 * public void run(String... args) throws Exception { try {
	 * System.out.println("starting");
	 * 
	 * User user = new User(); user.setFirstName("Suresh");
	 * user.setLastName("Sencha");
	 * user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
	 * user.setEmail("suresh@gmail.com");
	 * 
	 * Role role1 = new Role(); role1.setId(44L); role1.setName("ADMIN");
	 * 
	 * Set<Role> userRoleSet = new HashSet<>(); Role userRole = new Role();
	 * userRole.setName(role1); userRole.setUser(user); userRoleSet.add(userRole);
	 * 
	 * User createUser1 = this.userService.createUser(user, role1);
	 * System.out.println(createUser1.getEmail()); }catch(Exception e) {
	 * e.printStackTrace(); } }
	 */

}
