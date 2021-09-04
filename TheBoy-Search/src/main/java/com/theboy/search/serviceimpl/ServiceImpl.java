package com.theboy.search.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.theboy.repository.ProductRepository;
import com.theboy.search.service.ServiceInterface;

public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	private ProductRepository productRepository;
	
	

}
