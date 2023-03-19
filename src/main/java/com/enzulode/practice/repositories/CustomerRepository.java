package com.enzulode.practice.repositories;

import com.enzulode.practice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
}
