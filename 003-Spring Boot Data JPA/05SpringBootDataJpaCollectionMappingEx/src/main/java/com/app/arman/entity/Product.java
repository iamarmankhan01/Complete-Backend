package com.app.arman.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name="pdinfo")
public class Product {

	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pname")
	private String prodName;
	
	@ElementCollection
	@CollectionTable(name="prod_vendors",
  	joinColumns = @JoinColumn(name="pidFk")
	)
	@Column(name="vendor")
	private Set<String> vendors;
	
	
	@ElementCollection
	@CollectionTable(name="prod_version",
	joinColumns = @JoinColumn(name="pidFk")
	)
	@OrderColumn(name="pos") //index column
	@Column(name="version")
	private List<String> versions;
	
	
	@ElementCollection
	@CollectionTable(name="prod_clients",
	joinColumns = @JoinColumn(name="pidFk")	
	)
	@MapKeyColumn(name="code")
	@Column(name="cname")
	private Map<String,String> clients;



}
