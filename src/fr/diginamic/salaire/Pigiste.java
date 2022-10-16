package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	int nbJourTrav;
	double salaireJour;
	
	public Pigiste(String nom, String prenom,int nbJourTrav,double salaireJour) {
		super(nom, prenom);
		this.nbJourTrav=nbJourTrav;
		this.salaireJour=salaireJour;
	}

	public double getNbJourTrav() {
		return nbJourTrav;
	}

	public void setNbJourTrav(int nbJourTrav) {
		this.nbJourTrav = nbJourTrav;
	}

	public double getSalaireJour() {
		return salaireJour;
	}

	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}

	@Override
	public double getSalaire() {
	
		return 	(double) nbJourTrav*salaireJour;
	}

	@Override
	public String getContrat() {
		
		return "Pigiste";
	}
	

}
