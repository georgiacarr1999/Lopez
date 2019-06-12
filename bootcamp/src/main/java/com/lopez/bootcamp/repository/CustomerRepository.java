package com.lopez.bootcamp.repository;

import com.lopez.bootcamp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Query("FROM Customer WHERE customerEmail = :customerEmail")
    Customer findCustomerByCustomerEmail(@Param("customerEmail") String customerEmail);

}
