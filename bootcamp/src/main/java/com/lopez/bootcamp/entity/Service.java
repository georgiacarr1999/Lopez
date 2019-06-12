package com.lopez.bootcamp.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Services")
@EqualsAndHashCode(callSuper = false)

public class Service {

    @EmbeddedId

    private int serviceId;

    private String serviceName;

    private int price;

    private int duration;

    private String description;

    private int stylistId;
}
