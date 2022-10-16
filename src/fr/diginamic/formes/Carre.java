package fr.diginamic.formes;

public class Carre extends Rectangle {

	public Carre(double longueur) {
		super(longueur,longueur);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculSurface() {
		double surfaceCar=(longueur*longueur);
		return surfaceCar;
	}

	@Override
	public double calculPerimetre() {
		double perimCar=(longueur*4);
		return perimCar;
	}

}
