package fr.diginamic.entites;

public class Theatre {
	String nomT;
	int capacite;
	int totalclient;
	double recette;

	public Theatre(String nomT, int capacite, int totalclient, double recette) {
		super();
		this.nomT = nomT;
		this.capacite = capacite;
		this.totalclient = totalclient;
		this.recette = recette;
	}

	public void inscrire(int nbclient, double price) {

		if (nbclient + totalclient <= capacite) {
			totalclient += nbclient;
			recette = price * totalclient;
		} else {
			System.err.println("Total de capacité dépassé!");
		}
	}

	public String getNomT() {
		return nomT;
	}

	public void setNomT(String nomT) {
		this.nomT = nomT;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getTotalclient() {
		return totalclient;
	}

	public void setTotalclient(int totalclient) {
		this.totalclient = totalclient;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
}