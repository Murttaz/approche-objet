package fr.diginamic.maison;

public class Wc extends Piece{

	public Wc(int numetage,double superficie ) {
		super( numetage,superficie);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getType() {
		
		return Type_Wc;
	}
}
