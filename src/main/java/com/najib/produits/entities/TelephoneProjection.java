package com.najib.produits.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomTel", types = { Telephone.class })
public interface TelephoneProjection {
	public String getNomTelephone();

}
