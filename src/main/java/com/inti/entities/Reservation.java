package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Reservation {
	
	private Long idVoyageur;
	private Date dateReservation;
	private int nbheure;
	
	public Reservation() {
		super();
	}
	public Long getIdVoyageur() {
		return idVoyageur;
	}
	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public int getNbheure() {
		return nbheure;
	}
	public void setNbheure(int nbheure) {
		this.nbheure = nbheure;
	}

}
