package com.najib.produits.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Telephone {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idTelephone;
private String nomTelephone;
private String carTelephone;
private Double prixTelephone;
private Date dateCreation;
@ManyToOne
private Marque marque;
public Telephone() {
super();
}
public Telephone(String nomTelephone,String carTelephone, Double prixTelephone, Date dateCreation) {
super();
this.nomTelephone = nomTelephone;
this.prixTelephone = prixTelephone;
this.carTelephone =carTelephone;
this.dateCreation = dateCreation;
}

public Long getIdTelephone() {
	return idTelephone;
	}
	public void setIdTelephone(Long idTelephone) {
	this.idTelephone = idTelephone;
	}
	public String getNomTelephone() {
	return nomTelephone;
	}
	public void setNomTelephone(String nomTelephone) {
	this.nomTelephone = nomTelephone;
	}
	public Double getPrixTelephone() {
	return prixTelephone;
	}
	public void setPrixTelephone(Double prixTelephone) {
	this.prixTelephone = prixTelephone;
	}
	public Date getDateCreation() {
	return dateCreation;
	}
	
	public String getCarTelephone() {
		return carTelephone;
		}
		public void setCarTelephone(String carTelephone) {
		this.carTelephone = carTelephone;
		}
	
	
	
	
	public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
	return " [idTelephone=" + idTelephone + ", nomTelephone=" +

	nomTelephone + ", prixTelephone=" + prixTelephone 

	+ " ,carTelephone=" +carTelephone +" , dateCreation=" + dateCreation + "]";

	}
	}
