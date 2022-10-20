package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS  ("PRINTEMPS",1),
	ETE ("ETE",2),
	AUTOMNE ("AUTOMNE",3),
	HIVER("HIVER",4);

	private String libelle;
	private int numordre;

	private Saison(String libelle, int numordre) {
		this.libelle = libelle;
		this.numordre = numordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNumordre() {
		return numordre;
	}

	public static Saison trouveLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equalsIgnoreCase(libelle)) {
				return saison;
			}
		
		}
		return null;
		
}
}
