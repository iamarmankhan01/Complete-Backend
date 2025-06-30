package com.app.arman.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	private Integer usrId;
	
	@Column(name="uname")
	private String userName;
	
	@Column(name="upwd")
	private String userPwd;
	

	@OneToOne
	@JoinColumn(name="pidFk")             // New/latest => JPA with hibernate
	private Profile pob; //===HAS-A
	
	/*
	@ManyToOne                                // Old hibernate
	@JoinColumn(name="pidFk",unique=true)     // [**unique default is false, if true then  
	private Profile pob;                       //unique foreign key Id of second table  
	*/                                         //will be creared in first table and then here 
	                                           //ManyToOne means OneToOne**]
	
}