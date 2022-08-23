package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class VoyageurKevin {

	private Long idvoyageur;
	private String nom;
	private String prenom;
	private int age;
	
	public VoyageurKevin() {
		super();
	}
	public Long getIdvoyageur() {
		return idvoyageur;
	}
	public void setIdvoyageur(Long idvoyageur) {
		this.idvoyageur = idvoyageur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
