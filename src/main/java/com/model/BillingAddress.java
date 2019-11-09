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
@Table(name = "billingAddress")
public class BillingAddress implements Serializable {

	private static final long serialVersionUID = 1028098616457762743L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billindAddressId;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	@OneToOne(mappedBy = "billingAddress")
	private Customer customer;

}
