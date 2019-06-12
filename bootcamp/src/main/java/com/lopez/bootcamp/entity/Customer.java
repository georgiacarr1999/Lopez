package com.lopez.bootcamp.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Customers")
public class Customer{

    @Id
    private int customerId;

    private String customerEmail;

    private String customerName;

    private String paymentDetails;

}
