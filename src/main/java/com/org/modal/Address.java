package com.org.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Institute_Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String location;
	
	@ManyToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="coachingAddress_id")
	private CoachingInstitute addressCoachingInstitute;
	

	public Address() {
		super();
	}

	public Address(String location) {
		super();
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public CoachingInstitute getAddressCoachingInstitute() {
		return addressCoachingInstitute;
	}

	public void setAddressCoachingInstitute(CoachingInstitute addressCoachingInstitute) {
		this.addressCoachingInstitute = addressCoachingInstitute;
	}
	
	

}
