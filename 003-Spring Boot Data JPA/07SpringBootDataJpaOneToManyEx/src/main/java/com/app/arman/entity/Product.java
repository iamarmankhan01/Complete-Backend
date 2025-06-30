package com.app.arman.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="prodtab")

public class Product {

	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="pcode")
	private String prodCode;
	
	@Column(name="pcost")
	private Double prodCost;


}
