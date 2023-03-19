package com.enzulode.practice.customers;

import com.enzulode.practice.customers.requests.CustomerRequest;
import com.enzulode.practice.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/customers")
public class CustomerController
{
	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService)
	{
		this.customerService = customerService;
	}

	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}

	@GetMapping("{id}")
	public Customer getCustomer(@PathVariable("id") Long id)
	{
		return customerService.getCustomerById(id);
	}

	@PostMapping
	public void addCustomer(@RequestBody CustomerRequest request)
	{
		customerService.addNewCustomer(request);
	}

	@PutMapping("{id}")
	public void updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerRequest request)
	{
		customerService.updateCustomerById(id, request);
	}

	@DeleteMapping("{id}")
	public void deleteCustomer(@PathVariable("id") Long id)
	{
		customerService.deleteCustomerById(id);
	}
}
