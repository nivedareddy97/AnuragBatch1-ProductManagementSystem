package com.capgemini.god.service;

import java.util.List;

import com.capgemini.god.entity.Product;

public interface ProductService {
	Product productCreation(Product pro);

	Product getProductById(int id);

	List<Product> getAllProduct();

	Product delete(int id);

	Product updateProduct(Product prod);

}
/*Employee employeeCreation(Employee emp);

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployee();

	Employee delete(int id);

	Employee updateEmployee(Employee emp); */
