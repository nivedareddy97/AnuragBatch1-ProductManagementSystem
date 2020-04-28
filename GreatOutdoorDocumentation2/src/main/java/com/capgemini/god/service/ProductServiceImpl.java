package com.capgemini.god.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.god.entity.Product;
import com.capgemini.god.dao.ProductDaoImpl;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {
 
	@Autowired
	ProductDaoImpl dao;

	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#EmployeeCreation(com.example.entity.Employee)
	 */
	@Override
	public Product productCreation(Product pro) {
		return dao.productCreation(pro);
	}
	


	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#getEmployeeById(int)
	 */
	@Override
	public Product getProductById(int id) 
	{
	return dao.getProductById(id);
	}

	
	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#getAllEmployee()
	 */
	@Override
	public List<Product> getAllProduct() 
	{
	return dao.getAllProduct();
	}
		/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#delete(int)
	 */
	@Override
	public Product delete(int id) 
	{
		return dao.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#UpdateEmployee(com.example.entity.Employee)
	 */
	@Override
	public Product updateProduct(Product prod) {
		return dao.updateProduct(prod);	
	}

	}

