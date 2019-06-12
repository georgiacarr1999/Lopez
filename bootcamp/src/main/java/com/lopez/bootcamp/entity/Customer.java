package com.lopez.bootcamp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Customers")
@EqualsAndHashCode(callSuper = false)
public class Customer{

    @EmbeddedId
    private int customerId;

    private String customerEmail;

    private String customerName;

    private String paymentDetails;

}
