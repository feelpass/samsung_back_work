package com.example.iocexam.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private String name;
	private String email;
	private String password;

}
