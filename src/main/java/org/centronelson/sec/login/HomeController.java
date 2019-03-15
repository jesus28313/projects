package org.centronelson.sec.login;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class HomeController {

	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	
	@GetMapping("/greeter")
	public String greeterPage() {
		return "greeter";
	}
	
	@GetMapping("/public")
	public String publicPage() {
		return "public";
	}
	
	@GetMapping("/login")
	public String loginPage(Principal principal, RedirectAttributes attributes) {
		if(principal != null) {
			attributes.addFlashAttribute("info","You have already signed :)");
			
			return "redirect:/";
		}
		return "login";
	}
	
	 
}
