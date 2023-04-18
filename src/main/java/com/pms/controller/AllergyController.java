package com.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.entity.Allergy;
import com.pms.exception.AllergyServiceException;
import com.pms.service.impl.AllergyServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="*")
public class AllergyController {

	@Autowired
	private AllergyServiceImpl allergyService;
	
	

	@GetMapping("/allergies")
	public ResponseEntity<List<Allergy>> findAllAllergies() throws AllergyServiceException {
		List<Allergy> allergies = allergyService.getAllergies();
		return ResponseEntity.ok(allergies);
	}

	@GetMapping("/allergy")
	public ResponseEntity<Allergy> findAllergyById(@RequestParam("allergyId") String allergyId) throws AllergyServiceException {
		Allergy allergy = allergyService.getAllergyById(allergyId);
		return ResponseEntity.ok(allergy);
	}

}
