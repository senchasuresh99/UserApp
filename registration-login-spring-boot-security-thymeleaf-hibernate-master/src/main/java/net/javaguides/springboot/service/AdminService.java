package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.model.Admin;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface AdminService extends UserDetailsService {
	Admin save(UserRegistrationDto registrationDto);
}
