package com.app.arman.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="ordertab")
public class Order {
	@Id
	@Column(name="orid")
	private Integer ordId;
	@Column(name="ormode")
	private String ordMode;
	@Column(name="ordisc")
	private Double discount;
	
	@OneToMany
	@JoinColumn(name="ordIdFk")
	private List<Product> pobs;//HAS-A


}
