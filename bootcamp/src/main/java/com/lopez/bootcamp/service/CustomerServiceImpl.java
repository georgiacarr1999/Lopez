package com.lopez.bootcamp.service;

import com.lopez.bootcamp.entity.Customer;
import com.lopez.bootcamp.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CustomerServiceImpl implements CustomerManagementService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findCustomerByEmail(String customerEmail) {
        return customerRepository.findCustomerByCustomerEmail(customerEmail);
    }


}
