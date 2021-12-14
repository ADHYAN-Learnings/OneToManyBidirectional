package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.InterfService.InterfaceAddressService;
import com.org.interfRepository.AddressInterfaceRepository;
import com.org.modal.Address;

@Service
public class AdvanceAddressService implements InterfaceAddressService {
	
	@Autowired
	AddressInterfaceRepository addressRepository;

	@Override
	public Address getDetails(Long id) {
		return addressRepository.getById(id);
	}

	@Override
	public void saveDetails(Address address) {
		addressRepository.save(address);
		
	}

	@Override
	public List<Address> getAllDetails() {
		return addressRepository.findAll();
	}

	@Override
	public void deleteDetail(Long id) {
		addressRepository.deleteById(id);
	}

}
