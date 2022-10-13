package fr.diginamic.entites;


public class Cercle {
	public double rayon;
	static final double PI = Math.PI;
	

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	public double calculPerim() {
		double calculperim=0.00;
		calculperim=rayon*2*PI;
		return calculperim;
	}
	
	public double calculSurface() {
		double calculsurf=0.00;
		calculsurf=rayon*rayon*PI;
		return calculsurf;
	}
}
