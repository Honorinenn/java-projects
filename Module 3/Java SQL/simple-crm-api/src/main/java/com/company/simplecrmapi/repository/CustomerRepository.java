package com.company.simplecrmapi.repository;


import com.company.simplecrmapi.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCompany(String x);

    List<Customer> findByLastName(String alpha);
}
