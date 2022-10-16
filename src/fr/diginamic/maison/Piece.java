package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numetage;

	public static final String Type_Chambre = "Chambre";

	public static final String Type_Cuisine = "Cuisine";

	public static final String Type_Salon = "Salon";

	public static final String Type_Sdb = "Sdb";

	public static final String Type_Wc = "WC";

	public Piece(int numetage, double superficie) {
		super();
		this.superficie = superficie;
		this.numetage = numetage;
	}

	public abstract String getType();

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNbetage() {
		return numetage;
	}

	public void setNbetage(int nbetage) {
		this.numetage = nbetage;
	}

}
