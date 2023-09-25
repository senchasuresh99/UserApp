package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.service.AdminService;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
@Controller
@RequestMapping("/admin")
public class AdminRegistrationController {
	private AdminService adminService;

	public AdminRegistrationController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping("/show")
	public String showRegistrationForm() {
		return "admin/adminregistration";
	}
	
	@PostMapping("/save")
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		adminService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
