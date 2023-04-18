package com.pms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.entity.Allergy;
import com.pms.exception.AllergyServiceException;
import com.pms.repository.AllergyRepository;
import com.pms.service.AllergyService;

@Service
public class AllergyServiceImpl implements AllergyService {
	
	@Autowired
	private AllergyRepository allergyRepository;
	
	/*
	 * @Override public Allergy saveAllergy(Allergy allergy) { return
	 * allergyRepository.save(allergy); }
	 */


	@Override
	public List<Allergy> getAllergies() throws AllergyServiceException {
		
		List<Allergy> list = allergyRepository.findAll();
		if(list == null) {
			throw new AllergyServiceException("Allergy list is empty");
		}
		return list;
	}

	@Override
	public Allergy getAllergyById(String allergyId) throws AllergyServiceException {
		
		Allergy allergy = allergyRepository.findByAllergyId(allergyId);
		if(allergy == null) {
			throw new AllergyServiceException("Allergy with given id "+allergyId+" is not found on server");
		}
		return allergy;
	}
	
	/*
	 * @Override public void deleteAllergy(String allergyId) throws
	 * AllergyServiceException { boolean bool =
	 * allergyRepository.existsById(allergyId); if(!bool) { throw new
	 * AllergyServiceException("Allergy Id is not valid "+allergyId); }
	 * allergyRepository.deleteById(allergyId); }
	 * 
	 * @Override public Allergy updateAllergy(Allergy allergy,String allergyId)
	 * throws AllergyServiceException { Allergy existingAllergy =
	 * (allergyRepository.findById(allergyId).orElse(null));
	 * 
	 * if(existingAllergy == null) { throw new
	 * AllergyServiceException("Allergy Id is not valid "+allergyId); }
	 * 
	 * existingAllergy.setAllergyName(allergy.getAllergyName());
	 * existingAllergy.setNotes(allergy.getNotes()); return
	 * allergyRepository.save(existingAllergy); }
	 */

}
