package fichier;

public class Ville {

	private String nom;
	private String dpt;
	private String region;
	private int nbhabr;

	public Ville(String nom, String dpt, String region, int nbhabr) {
		super();
		this.nom = nom;
		this.dpt = dpt;
		this.region = region;
		this.nbhabr = nbhabr;
	}

	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", dpt=" + dpt + ", region=" + region + ", nbhabr=" + nbhabr + "]";
	}

	public String toString2() {
		return nom+";"+dpt+";"+region+";"+nbhabr+";";
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getNbhabr() {
		return nbhabr;
	}

	public void setNbhabr(int nbhabr) {
		this.nbhabr = nbhabr;
	}

}
