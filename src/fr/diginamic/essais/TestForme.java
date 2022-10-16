package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme cercle1 = new Cercle(3.42);
		Forme rectangle1= new Rectangle(4.29,3.76);
		Forme carre1=new Carre(5.23);
		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(rectangle1);
		AffichageForme.afficher(carre1);
	}

}
