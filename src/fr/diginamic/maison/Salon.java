package fr.diginamic.maison;

public class Salon extends Piece {

	public Salon( int numetage,double superficie) {
		super(numetage,superficie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {

		return Type_Salon;
	}
}
