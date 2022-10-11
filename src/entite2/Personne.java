package entite2;

import entites.AdressePostale;
import entites.TestAdressePostale;

public class Personne {


	public AdressePostale adresse;
	public String nom;
	public String prenom;

	public Personne(String FirstName, String LastName) {

		prenom = FirstName;
		nom = LastName;

	}

	public Personne(String FirstName, String LastName, AdressePostale adress) {
		this.prenom = FirstName;
		this.nom=LastName;
		this.adresse=adress;
	}
	
	public String identite() {

		return prenom+" "+nom.toUpperCase();
		
	}
	
	public void setNom (String LastName) {
		this.nom=LastName;
	}
	
	public void setPrenom (String FirstName) {
		this.prenom=FirstName;
		
	}
	
	public void setAdresse (AdressePostale nvAdress) {
		this.adresse=nvAdress;
	}
	public String getNom() {
		
		return this.nom;
	}
	public String getPrenom () {
		
		return this.prenom;
	}
	public AdressePostale getAdresse () {
		
		return this.adresse;
	}
}
