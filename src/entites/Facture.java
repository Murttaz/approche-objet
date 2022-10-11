package entites;

public class Facture {

	private double consommationKwh;
	private double montant;

	// si je ne prends que le constructeur ci-dessous, la classe est dite "immutable"
	public Facture(double consommationKwh) {
		this.consommationKwh = consommationKwh;
		this.montant = consommationKwh * 0.15;
	}
	
	// si on rajoute le constructeur ci-dessous il y a une possibilité de changer les informations, la classe n'est donc plus immutable

	public void modifierConsommation(double nvConsommation) {
		this.consommationKwh = nvConsommation;
		this.montant = nvConsommation * 0.15;
	}

	
	
	public double getConsommationKwh() {
		return consommationKwh;
	}

	public double getMontant() {
		return montant;
	}
}
