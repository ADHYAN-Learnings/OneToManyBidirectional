package com.org.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.InterfService.InterfaceCoachingInstituteService;
import com.org.modal.Address;
import com.org.modal.CoachingInstitute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class CoachingInstituteController {
	
	@Autowired
	InterfaceCoachingInstituteService coachingInfo;
	
	@GetMapping("saveNewDetail")
	public String newDetails(@RequestParam("id") Optional<Long> id,Model model,@ModelAttribute CoachingInstitute coachingInstitute) {
		
		if(id.isPresent()) {
			model.addAttribute("institute", coachingInfo.getDetails(id.get()));
			
		} else {
			model.addAttribute("institute", new CoachingInstitute());	
		}
		 
		return "coachingInstitute_save";
	}
	
	@PostMapping(value="add")
	public String saveDetails(Model model,@Valid @ModelAttribute("institute") CoachingInstitute coachingInstitute,BindingResult bindingResult,
			@RequestParam("location") List<Address> location) {
		coachingInstitute.setCoachingInstituteAddress(location);
		if(bindingResult.hasErrors()) {
			return "coachingInstitute_save";
		}
		
		coachingInfo.saveDetails(coachingInstitute);
		model.addAttribute("institute", new CoachingInstitute());		
		return "redirect:/totalDetails";
	}
	
	@GetMapping("totalDetails")
	public String getAllDetails(Model model) {
		model.addAttribute("institute", coachingInfo.getAllDetails());
		return "coachingInstitute";
	}
	
	@GetMapping("delete")
	public String deleteDataById(@RequestParam("id") Long id) {
		coachingInfo.deleteDetail(id);
		return "redirect:/totalDetails";
	}
}
