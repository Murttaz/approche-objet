package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Personne guy1 = new Personne();
		guy1.nom="Quiniou";
		guy1.prenom="Chloe";
		guy1.adresse= new AdressePostale();
		guy1.adresse.numeroDeRue=7;
		guy1.adresse.libelleDeRue="Rue de la france Libre";
		guy1.adresse.codePostal=29000;
		guy1.adresse.ville="Quimper";
		Personne guy2 = new Personne();
		guy2.nom="Michel";
		guy2.prenom="Fournier";
		guy2.adresse= new AdressePostale();
		guy2.adresse.numeroDeRue=8;
		guy2.adresse.libelleDeRue="impasse de Guenole";
		guy2.adresse.codePostal=44300;
		guy2.adresse.ville="Nantes";
		
		 cette façon de faire est très fastidieuse parce qu'elle oblige 
		 * à retaper toutes les coordonnées alors que nous les avions déja rentré dans 
		 * TestAdressePostale. Il y'a donc beaucoup trop de ligne.*/ 
		Personne guy1 = new Personne("Quiniou","Chloe",new AdressePostale(7,"rue de la france libre",29000,"Quimper"));

		Personne guy2 = new Personne("Fournier","Michel",new AdressePostale(8,"impasse de Guenole",44300,"Nantes"));
	
		
		/* cette façon de faire est moins fastidieuse parce que la première car il 
		 * n'y a pas utant de lignes à taper.
		 *  Elle reste assez longue car on doit tout de même retaper toutes les 
		 *  informations alors qu'elles sont déja enregistrées dans TestAdresse.
		 *  Il y'a donc moins de ligne certe, mais nous perdons du temps 
		 *  et des lignes puisque les informations sont déjà notées autre part.
		 */ 
		 
	}

}
