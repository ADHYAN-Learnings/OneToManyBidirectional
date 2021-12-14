package com.org.InterfService;

import java.util.List;
import com.org.modal.CoachingInstitute;

public interface InterfaceCoachingInstituteService {

	  CoachingInstitute getDetails(Long id);
	  void saveDetails(CoachingInstitute coachingInstitute); 
	  List<CoachingInstitute> getAllDetails();
	  void deleteDetail(Long id);
}
