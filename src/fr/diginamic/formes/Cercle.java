package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculSurface() {
		double surfaceC=Math.PI*Math.pow(this.rayon, 2);
		return surfaceC;
	}

	@Override
	public double calculPerimetre() {
		
		double perimC=(2*Math.PI*rayon);
		return perimC;
	}

}
