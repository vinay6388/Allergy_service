package com.pms.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entity.Allergy;






public interface AllergyRepository extends JpaRepository<Allergy, String> {
	
	public Allergy findByAllergyId(String allergyId);
	
}
