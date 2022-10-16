package fr.diginamic.maison;

public class Chambre extends Piece{

	public Chambre( int numetage,double superficie) {
		super(numetage,superficie );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		
		return Type_Chambre;
	}
	
	

}
