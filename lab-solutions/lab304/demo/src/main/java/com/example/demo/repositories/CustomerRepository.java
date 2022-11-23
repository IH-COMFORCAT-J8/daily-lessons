package com.example.demo.repositories;

import com.example.demo.models.Customer;
import com.example.demo.models.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByName(String name);

    List<Customer> findByCustomerStatus(CustomerStatus customerStatus);
}
