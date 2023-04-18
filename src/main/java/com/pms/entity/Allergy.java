package com.pms.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "allergy")
public class Allergy {
	
	@Id
	@GeneratedValue(generator = CustomIdGenerator.GENERATOR_NAME)
	@GenericGenerator(name = CustomIdGenerator.GENERATOR_NAME, strategy = "com.pms.entity.CustomIdGenerator", parameters = {
	@Parameter(name = CustomIdGenerator.PREFIX_PARAM, value = "AL0") })
	@Column(name = "allergy_id")
	private String allergyId;
	
	@NotBlank
	@Column(name = "allergy_name")
	private String allergyName;
	
	@NotBlank
	private String notes;
	
	
	
	
	
	

}
