package com.hookfish.EcommerceAPI.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @Column(unique = true)
    private String customerPhoneNumber;

    @Column(unique = true)
    private String customerEmail;

//    @OneToMany(mappedBy = "customer")
//    private List<Orders> orders;

}

