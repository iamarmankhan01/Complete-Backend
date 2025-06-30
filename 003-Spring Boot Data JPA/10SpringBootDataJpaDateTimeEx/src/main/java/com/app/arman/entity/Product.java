package com.app.arman.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prd_date")
public class Product {
	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="pcode")
	private String pcode;
	
	@Temporal(TemporalType.DATE)
	@Column(name="pmfgdte")
	private Date mfgDate; //date
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pexpdte")
	private Date expDate; //date+time
	
	@Temporal(TemporalType.TIME)
	@Column(name="pexptim")
	private Date exportedTime; //time
}

