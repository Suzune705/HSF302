package com.demo4.mapper;


import com.demo4.model.dto.response.CustomerResponse;
import com.demo4.model.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerMapper {
    public List<CustomerResponse> toCustomerResponse(List<Customer> customers){
        return customers.stream()
                .map(entity -> new CustomerResponse(
                        entity.getCustomerName(),
                        entity.getPhone()
                ))
                .toList();
    }
}
