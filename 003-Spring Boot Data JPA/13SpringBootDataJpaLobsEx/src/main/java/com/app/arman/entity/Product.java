package com.app.arman.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prodtab")
public class Product {
    @Id
    @Column(name = "pid")
    private Integer prodId;

    @Column(name = "pcode")
    private String prodCode;

    @Column(name = "pcost")
    private Double prodCost;

    @Lob
    @Column(name = "pimg", columnDefinition = "LONGBLOB")
    private byte[] prodImg;

    @Lob
    @Column(name = "pdsc", columnDefinition = "LONGTEXT")
    private String prodDesc;  // Use String for CLOB fields
}
