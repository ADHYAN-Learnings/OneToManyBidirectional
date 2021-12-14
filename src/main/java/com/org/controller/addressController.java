package com.org.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.InterfService.InterfaceAddressService;
import com.org.modal.Address;
import com.org.modal.CoachingInstitute;

@Controller
@RequestMapping("/address")
public class addressController {
	
	@Autowired
	InterfaceAddressService addressService;
	
	@GetMapping("/saveNewDetail")
	public String newDetails(@RequestParam("id") Optional<Long> id,Model model,@ModelAttribute Address address) {
		
		if(id.isPresent()) {
			model.addAttribute("address", addressService.getDetails(id.get()));
			
		} else {
			model.addAttribute("address", new Address());	
		}
		 
		return "address_save";
	}
	
	@PostMapping(value="/add")
	public String saveDetails(Model model,@Valid @ModelAttribute("address") Address address,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "address_save";
		}
		
		addressService.saveDetails(address);
		model.addAttribute("address", new Address());		
		return "redirect:/address/totalDetails";
	}
	
	@GetMapping("/totalDetails")
	public String getAllDetails(Model model) {
		model.addAttribute("address", addressService.getAllDetails());
		return "address";
	}
	
	@GetMapping("/delete")
	public String deleteDataById(@RequestParam("id") Long id) {
		addressService.deleteDetail(id);
		return "redirect:/address/totalDetails";
	}


}
