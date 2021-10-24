package com.najib.produits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najib.produits.entities.Marque;
import com.najib.produits.entities.Telephone;
import com.najib.produits.repos.TelephoneRepository;
@Service
public class TelephoneServiceImpl implements TelephoneService {
@Autowired
TelephoneRepository telephoneRepository;
@Override
public Telephone saveTelephone(Telephone p) {
return telephoneRepository.save(p);
}
@Override
public Telephone updateTelephone(Telephone p) {
return telephoneRepository.save(p);
}
@Override
public void deleteTelephone(Telephone p) {
telephoneRepository.delete(p);
}
@Override
public void deleteTelephoneById(Long id) {
telephoneRepository.deleteById(id);
}
@Override
public Telephone getTelephone(Long id) {
return telephoneRepository.findById(id).get();
}
@Override
public List<Telephone> getAllTelephones() {
return telephoneRepository.findAll();
}


@Override
public List<Telephone> findByNomTelephone(String nom) {
return telephoneRepository.findByNomTelephone(nom);
}
@Override
public List<Telephone> findByNomTelephoneContains(String nom) {
return telephoneRepository.findByNomTelephoneContains(nom);
}
@Override
public List<Telephone> findByNomPrix(String nom, Double prix) { 
	return telephoneRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Telephone> findByMarque(Marque marque) {
	return telephoneRepository.findByMarque(marque);
	}
	@Override
	public List<Telephone> findByMarqueIdMar(Long id) {
	return telephoneRepository.findByMarqueIdMar(id);
	}
	@Override
	public List<Telephone> findByOrderByNomTelephoneAsc() {
	return telephoneRepository.findByOrderByNomTelephoneAsc();
	}
	@Override
	public List<Telephone> trierTelephonesNomsPrix() {
	return telephoneRepository.trierTelephonesNomsPrix();
	}
}










