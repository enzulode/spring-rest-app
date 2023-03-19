package com.enzulode.practice.customers.requests;

import lombok.Data;

@Data
public class CustomerRequest
{
	private final String name;
	private final String email;
	private final Integer age;
}
