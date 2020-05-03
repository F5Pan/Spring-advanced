package com.wayne.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import com.wayne.domain.User;

public class Userform {

	// public static final String PHONE_REG =
	// "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
	public static final String PHONE_REG = "^09[0-9]{8}$";

	@NotBlank(message = "必填欄位")
	private String username;
	@Length(min = 6, message = "密碼最少需要6位")
	private String password;
	@Pattern(regexp = PHONE_REG, message = "請輸入正確的手機號碼")
	private String phone;
	@Email
	private String email;
	@NotBlank(message = "必填欄位")
	private String confirmPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public boolean confirmPassword() {
		if (this.password.equals(this.confirmPassword)) {
			return true;
		}
		return false;
	}

	public User convertToUser() {
		User user = new UserFormConvert().convert(Userform.this);
		return user;
	}

	private class UserFormConvert implements FormConvert<Userform, User> {

		@Override
		public User convert(Userform userform) {
			User user = new User();
			BeanUtils.copyProperties(userform, user);
			return user;
		}
	}

}
