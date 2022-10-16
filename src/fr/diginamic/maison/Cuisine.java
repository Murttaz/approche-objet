package fr.diginamic.maison;

public class Cuisine extends Piece{

	public Cuisine(int numetage,double superficie ) {
		super(numetage,superficie );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		
		return Type_Cuisine;
	}
}
