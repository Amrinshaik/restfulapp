package com.capgemini.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.order.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
