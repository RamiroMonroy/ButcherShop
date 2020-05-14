package com.udea.butchershop.butchershop.repository;

import com.udea.butchershop.butchershop.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
