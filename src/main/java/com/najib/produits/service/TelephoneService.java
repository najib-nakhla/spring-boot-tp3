package com.najib.produits.service;

import java.util.List;

import com.najib.produits.entities.Marque;
import com.najib.produits.entities.Telephone;
public interface TelephoneService {
Telephone saveTelephone(Telephone p);
Telephone updateTelephone(Telephone p);
void deleteTelephone(Telephone p);
void deleteTelephoneById(Long id);
Telephone getTelephone(Long id);
List<Telephone> getAllTelephones();


List<Telephone> findByNomTelephone(String nom);
List<Telephone> findByNomTelephoneContains(String nom);
List<Telephone> findByNomPrix (String nom, Double prix);
List<Telephone> findByMarque (Marque marque);
List<Telephone> findByMarqueIdMar(Long id);
List<Telephone> findByOrderByNomTelephoneAsc();
List<Telephone> trierTelephonesNomsPrix();

}