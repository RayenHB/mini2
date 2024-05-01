package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long idTy;
	private String nomTy;
	private String descriptionTy;
	@OneToMany(mappedBy = "type")
	private List<Rocket> rockets;
	
	public Type(String nomTy, String descriptionTy, List<Rocket> rockets)
	{
	super();
	this.nomTy = nomTy;
	this.descriptionTy = descriptionTy;
	this.rockets = rockets;
	}
	public Long getIdTy() {
		return idTy;
	}
	public void setIdTy(Long idTy) {
		this.idTy = idTy;
	}
	public String getNomTy() {
		return nomTy;
	}
	public void setNomTy(String nomTy) {
		this.nomTy = nomTy;
	}
	public String getDescriptionTy() {
		return descriptionTy;
	}
	public void setDescriptionTy(String descriptionTy) {
		this.descriptionTy = descriptionTy;
	}
	public List<Rocket> getRockets() {
		return rockets;
	}
	public void setRockets(List<Rocket> rockets) {
		this.rockets = rockets;
	}
	

}
