package com.najib.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.najib.produits.entities.Marque;
import com.najib.produits.entities.Telephone;
@RepositoryRestResource(path = "rest")
public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
	List<Telephone> findByNomTelephone(String nom);
	List<Telephone> findByNomTelephoneContains(String nom);
	@Query("select p from Telephone p where p.nomTelephone like %?1 and p.prixTelephone > ?2")
	List<Telephone> findByNomPrix (String nom, Double prix);
	@Query("select p from Telephone p where p.marque = ?1")
	List<Telephone> findByMarque (Marque marque);
	List<Telephone> findByMarqueIdMar(Long id);
	List<Telephone> findByOrderByNomTelephoneAsc();
	@Query("select p from Telephone p order by p.nomTelephone ASC, p.prixTelephone DESC")
	List<Telephone> trierTelephonesNomsPrix ();
	
	
}
