package com.lopez.bootcamp.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "Appointments")
@EqualsAndHashCode(callSuper = false)
public class Appointment {

    @EmbeddedId
    private int appointmentId;

    private Date dateCreated;

    private int customerId;

    private boolean paymentTaken;

    private int serviceId;

}
