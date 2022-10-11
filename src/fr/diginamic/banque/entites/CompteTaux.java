package fr.diginamic.banque.entites;

public class CompteTaux  extends Compte{
	
	private double tauxRemu = 1.75;

	public CompteTaux(int numero, double solde,double remuTaux) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
		this.tauxRemu=tauxRemu;
	}
	
	public String toString() {
		return super.toString()+ "," + tauxRemu;
	}

	public double getTauxRemu() {
		return tauxRemu;
	}

	public void setTauxRemu(double tauxRemu) {
		this.tauxRemu = tauxRemu;
	}

}
