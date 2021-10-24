package com.najib.produits.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMar;
private String nomMar;
private String descriptionMar;
@JsonIgnore
@OneToMany(mappedBy = "marque")
private List<Telephone> telephones;

public Marque(String nomMar, String descriptionMar, List<Telephone> telephones)
{

super();
this.nomMar = nomMar;
this.descriptionMar = descriptionMar;
this.telephones = telephones;
}
public Long getIdMar() {
return idMar;
}
public void setIdMar(Long idMar) {
this.idMar = idMar;
}
public String getNomMar() {
return nomMar;
}
public void setNomMar(String nomMar) {
this.nomMar = nomMar;
}
public String getDescriptionMar() {
return descriptionMar;
}
public void setDescriptionMar(String descriptionMar) {
this.descriptionMar = descriptionMar;
}
public List<Telephone> getTelephones() {
return telephones;
}
public void setTelephones(List<Telephone> telephones) {
this.telephones = telephones;
}
}