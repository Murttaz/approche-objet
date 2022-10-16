package fr.diginamic.formes;

public class Rectangle extends Forme {

	public double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double calculSurface() {
		double surfaceR=(longueur*largeur);
		return surfaceR;
	}

	@Override
	public double calculPerimetre() {
		double perimR=(longueur+largeur)*2;
		return perimR;
	}

}
