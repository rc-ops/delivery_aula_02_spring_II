package com.example.delivery.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String andress;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	private Set<Product> products = new HashSet<>();
	
	public Order() {}

	public Order(Long id, String andress, Double latitude, Double longitude, Instant instant, OrderStatus status,
			Set<Product> products) {
		this.id = id;
		this.andress = andress;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = instant;
		this.status = status;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAndress() {
		return andress;
	}

	public void setAndress(String andress) {
		this.andress = andress;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", andress=" + andress + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", moment=" + moment + ", status=" + status + ", products=" + products + "]";
	}
	
	
	
	
	
	
	

}
