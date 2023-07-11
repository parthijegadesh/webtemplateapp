package com.webtemplate.app.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

	private Long userId;

	@NonNull
	private String userFullName;

	@NonNull
	private String userName;

	@NonNull
	private String password;
	
	@NonNull
	private String confirmPassword;

	@NonNull
	private String gender;

	private String city;

	private String state;
	
	@NonNull
	private String emailId;

}
