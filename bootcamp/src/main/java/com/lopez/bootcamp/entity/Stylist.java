package com.lopez.bootcamp.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "content")
@EqualsAndHashCode(callSuper = false)

public class Stylist {


    @EmbeddedId
    private int serviceId;

    private String stylistName;

    private int price;

    private int duration;

    private String description;

    private int stylistId;
}
