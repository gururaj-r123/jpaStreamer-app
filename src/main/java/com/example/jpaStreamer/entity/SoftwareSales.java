package com.example.jpaStreamer.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareSales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String softwareName;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private String vendor;

    @Column(nullable = false)
    private String licenseKey;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private LocalDate expirationDate;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String currency;

    @Column
    private String description;

    @Column(nullable = false)
    private String category;

    @Column
    private String userEmail;

    @Column
    private Integer numberOfLicenses;

    @Column(nullable = false)
    private Boolean isRenewed;

    @Column
    private String supportContact;

    @Column
    private LocalDate lastUpdated;
}


