package sets;

public class Pays {

	private String nom;
	private int nbhab;
	private double PIBHab;

	public Pays(String nom, int nbhab, double pIBHab) {
		super();
		this.nom = nom;
		this.nbhab = nbhab;
		PIBHab = pIBHab;
	}
	
	public double getPibTotal() {
		return PIBHab *(double) nbhab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhab() {
		return nbhab;
	}

	public void setNbhab(int nbhab) {
		this.nbhab = nbhab;
	}

	public double getPIBHab() {
		return PIBHab;
	}

	public void setPIBHab(double pIBHab) {
		PIBHab = pIBHab;
	}
	@Override
	public String toString() {
		return nom +" : " + nbhab+ " habitants, Pib (en milliers de milliards) : "+PIBHab;
		
	}
}
