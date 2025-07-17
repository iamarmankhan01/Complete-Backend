package com.app.arman.entity;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usertab")
public class User {
	@Id
	@Column(name="uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name="uname")
	private String userName;
	
	@Column(name="umail")
	private String userEmail;
	
	@Column(name="upwd")
	private String userPassword;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="user_roles_tab",
		joinColumns = @JoinColumn(name="uid"))
	@Column(name="urole")
	private Set<String> userRoles;
}
