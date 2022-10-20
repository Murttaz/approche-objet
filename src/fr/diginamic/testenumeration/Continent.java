package fr.diginamic.testenumeration;

public enum Continent {
	
	AMERIQUE ("AMERIQUE"),
	ASIE ("ASIE"),
	AFRIQUE("AFRIQUE"),
	EUROPE("EUROPE"),
	OCEANIE("OCEANIE");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

}
