package com.wayne.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.wayne.domain.User;
import com.wayne.domain.UserRepository;
import com.wayne.form.Userform;

@Controller
public class LoginController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/register")
	public String registerPost(@Valid Userform userform, BindingResult result) {
		  boolean boo = true;
	        if (!userform.confirmPassword()) {
	            result.rejectValue("confirmPassword","confirmError","密碼不一致");
	            boo = false;
	        }
	        if (result.hasErrors()) {
	            List<FieldError> fieldErrors = result.getFieldErrors();
	            for (FieldError error : fieldErrors) {
	                System.out.println(error.getField() + " : " + error.getDefaultMessage() + " : " + error.getCode());
	            }
	            boo = false;
	        }

	        if (!boo) {
	            return "register";
	        }
		User user = userform.convertToUser();
		userRepository.save(user);
		return "redirect:/login";
	}
}
