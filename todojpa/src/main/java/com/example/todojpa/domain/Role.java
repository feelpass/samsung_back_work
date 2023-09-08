package com.example.todojpa.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Role {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(unique = true, nullable = false)
	private String rolename;
	
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

}
