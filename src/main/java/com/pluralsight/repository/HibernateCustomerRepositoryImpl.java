package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;
import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Phill");
        customer.setLastName("Byrd");
        customers.add(customer);

        return customers;

    }
}
