package com.org.service;
import org.springframework.stereotype.Service;

import com.org.InterfService.InterfaceCoachingInstituteService;
import com.org.interfRepository.CoachingInstituteInterfaceRepository;
import com.org.modal.CoachingInstitute;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AdvancedCoachingInstituteService implements InterfaceCoachingInstituteService {
	
	@Autowired
	CoachingInstituteInterfaceRepository coachingInstituteRepository;

	@Override
	public CoachingInstitute getDetails(Long id) {
		
		return coachingInstituteRepository.getById(id);
	}

	@Override
	public void saveDetails(CoachingInstitute coachingInstitute) {
		
		coachingInstituteRepository.save(coachingInstitute);
		
	}

	@Override
	public List<CoachingInstitute> getAllDetails() {
		return coachingInstituteRepository.findAll();
	}

	@Override
	public void deleteDetail(Long id) {
		coachingInstituteRepository.deleteById(id);
		
	}
}  
