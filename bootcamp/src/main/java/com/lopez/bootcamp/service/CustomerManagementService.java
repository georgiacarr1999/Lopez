package com.lopez.bootcamp.service;

import com.lopez.bootcamp.entity.Customer;

public interface CustomerManagementService {

    Customer findCustomerByEmail(String customerEmail);

}
