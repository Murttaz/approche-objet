package entite2;

import entites.AdressePostale;

public class Personne {

	public AdressePostale adresse;
	public String nom;
	public String prenom;

	public Personne(String FirstName, String LastName) {

		nom = FirstName;
		prenom = LastName;

	}

	public Personne(String FirstName, String LastName, AdressePostale adress) {
		nom = FirstName;
		prenom=LastName;
		adresse=adress;
	}
}
