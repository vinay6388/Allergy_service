package com.pms.service;

import java.util.List;

import com.pms.entity.Allergy;
import com.pms.exception.AllergyServiceException;


public interface AllergyService {
	
	
	public List<Allergy> getAllergies()throws AllergyServiceException;
	
	public Allergy getAllergyById(String allergyId)throws AllergyServiceException;
	
	/*
	 * public Allergy saveAllergy(Allergy allergy);
	 * 
	 * public void deleteAllergy(String allergyId) throws AllergyServiceException;
	 * 
	 * public Allergy updateAllergy(Allergy allergy,String allergyId) throws
	 * AllergyServiceException;
	 */
	

}
