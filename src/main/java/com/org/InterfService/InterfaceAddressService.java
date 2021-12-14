package com.org.InterfService;

import java.util.List;
import com.org.modal.Address;

public interface InterfaceAddressService {
	  Address getDetails(Long id);
	  void saveDetails(Address address); 
	  List<Address> getAllDetails();
	  void deleteDetail(Long id);
}
