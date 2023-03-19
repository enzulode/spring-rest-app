package com.enzulode.practice.customers;

import com.enzulode.practice.customers.requests.CustomerRequest;
import com.enzulode.practice.models.Customer;
import com.enzulode.practice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService
{
	private final CustomerRepository repository;

	@Autowired
	public CustomerService(CustomerRepository repository)
	{
		this.repository = repository;
	}

	public List<Customer> getAllCustomers()
	{
		return repository.findAll();
	}

	public Customer getCustomerById(Long id)
	{
		return repository.getReferenceById(id);
	}

	public void addNewCustomer(CustomerRequest request)
	{
		Customer customer = new Customer();
		customer.setName(request.getName());
		customer.setEmail(request.getEmail());
		customer.setAge(request.getAge());

		repository.save(customer);
	}

	public void updateCustomerById(Long id, CustomerRequest request)
	{
		Customer customer = repository.getReferenceById(id);
		customer.setName(request.getName());
		customer.setEmail(request.getEmail());
		customer.setAge(request.getAge());
		repository.save(customer);
	}

	public void deleteCustomerById(Long id)
	{
		repository.deleteById(id);
	}



}
