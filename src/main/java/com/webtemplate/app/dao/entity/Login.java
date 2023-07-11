package com.webtemplate.app.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LOGIN_USERS")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOGIN_ID")
	private Long loginId;

	@Column(name = "USER_ID")
	private Long loggedInUserId;

	@Column(name = "LOGIN_TIME")
	private LocalDateTime loginUserTime;

	@Column(name = "LOGOUT_TIME")
	private LocalDateTime logoutUserTime;

	@Column(name = "REMEMBERME")
	private String rememberMe;
}
