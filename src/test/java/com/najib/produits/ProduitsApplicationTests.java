package com.najib.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.najib.produits.entities.Marque;
import com.najib.produits.entities.Telephone;
import com.najib.produits.entities.Telephone;
import com.najib.produits.repos.TelephoneRepository;
import com.najib.produits.repos.TelephoneRepository;
@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private TelephoneRepository telephoneRepository;
@Test
public void testCreateTelephone() {
	Telephone p = new Telephone("Iphone11","puissant,IOS",2200.500,new Date());
telephoneRepository.save(p);
}
@Test
public void testFindTelephone()
{
Telephone p = telephoneRepository.findById(1L).get(); 

System.out.println(p);
}
@Test
public void testUpdateTelephone()
{
Telephone p = telephoneRepository.findById(2L).get();
p.setPrixTelephone(2000.0);

telephoneRepository.save(p);
}
@Test
public void testDeleteTelephone()
{
	telephoneRepository.deleteById(1L);;
}
@Test
public void testListerTousTelephones()
{
List<Telephone> tels = telephoneRepository.findAll();
for (Telephone p : tels)
{
System.out.println(p);
}

}


@Test
public void testFindByNomTelephone()
{
List<Telephone> tels = telephoneRepository.findByNomTelephone("iphone11");

for (Telephone p : tels)
{
System.out.println(p);
}	

}

@Test
public void testFindByNomTelephoneContains ()
{
List<Telephone> tels=telephoneRepository.findByNomTelephoneContains("iphone11");

for (Telephone p : tels)
{
System.out.println(p);
} }
@Test
public void testfindByNomPrix()
{
List<Telephone> tels = telephoneRepository.findByNomPrix("iphone11", 2.0);
for (Telephone p : tels)
{
System.out.println(p);
}

}

@Test
public void testfindByMarque()
{
Marque mar = new Marque();
mar.setIdMar(1L);
List<Telephone> tels = telephoneRepository.findByMarque(mar);
for (Telephone p : tels)
{
System.out.println(p);
}

}
@Test
public void findByMarqueIdMar()
{
List<Telephone> tels = telephoneRepository.findByMarqueIdMar(1L);
for (Telephone p : tels)
{
System.out.println(p);
}

}

@Test
public void testfindByOrderByNomTelephoneAsc()
{
List<Telephone> tels =

telephoneRepository.findByOrderByNomTelephoneAsc();
for (Telephone p : tels)
{
System.out.println(p);
}

}

@Test
public void testTrierTelephonesNomsPrix()
{
List<Telephone> tels = telephoneRepository.trierTelephonesNomsPrix();
for (Telephone p : tels)
{
System.out.println(p);
}

}




}

