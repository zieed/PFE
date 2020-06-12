package org.iset.sbz.ServiceStage;

import org.iset.sbz.ServiceStage.Actors.Etudiant;
import org.iset.sbz.ServiceStage.repositories.EtudiantRep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DbSeeder implements CommandLineRunner{
   
	private EtudiantRep etudiantRep;
    
	public DbSeeder(EtudiantRep etudiantRep) {
		super();
		this.etudiantRep = etudiantRep;
	}

	@Override
	public void run(String... args) throws Exception {
		Etudiant zied = new Etudiant(1,"horbit","zied",11611871,"horbit.zied@gmail.com","Technologie Informatique","MDW3",99946281);
		Etudiant rakia = new Etudiant(2,"chebbi","rakia",11611571,"chebbi.rakia@gmail.com","Technologie Informatique","MDW3",28456281);
		Etudiant noura = new Etudiant(3,"hamdouni","noura",11611920,"noura.hamdouni@gmail.com","Technologie Informatique","MDW3",55546281);
		this.etudiantRep.deleteAll();
		this.etudiantRep.save(zied);
		this.etudiantRep.save(rakia);
		this.etudiantRep.save(noura);
	}
	
	

}
