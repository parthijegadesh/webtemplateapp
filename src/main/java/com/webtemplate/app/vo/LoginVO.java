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
public class LoginVO {

	private Long userId;

	@NonNull
	private String userName;

	@NonNull
	private String password;

	private String rememberMe;
}
