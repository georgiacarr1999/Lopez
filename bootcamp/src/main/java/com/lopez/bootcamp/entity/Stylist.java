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

    private String stylistName;

    private String stylistEmail;

    private int stylistId;

    private String stylistAddress;
}
