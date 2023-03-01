package com.example.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.dtos.ProductDTO;
import com.example.delivery.entities.Product;
import com.example.delivery.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<String> finAll(){
		return service.finAll();
	}
	
	@GetMapping("/all")
	public List<Product> findAllProduct(){
		return service.findAllProducts();
	}
	
	@GetMapping("/productsDto")
	public List<ProductDTO> findAllProductDto(){
		return service.findAllProductsDto();
	}

}
