package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		/* cette façon de faire est très fastidieuse parce qu'elle oblige 
		 * à retaper toutes les coordonnées alors que nous les avions déja rentré dans 
		 * TestAdressePostale. Il y'a donc beaucoup trop de ligne.*/ 
		 
	}

}
