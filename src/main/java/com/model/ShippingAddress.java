package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "shippingAddress")
public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 7551999649936522523L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shippingAddressId;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	@OneToOne(mappedBy = "shippingAddress")
	private Customer customer;
}
