package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(2.75);
		Cercle c2 = new Cercle(15.23);
		Cercle c3 = CercleFactory.retourcercle(3.25);

		Double[] tabcercle = new Double[6];
		tabcercle[0] = c1.calculPerim();
		tabcercle[1] = c2.calculPerim();
		tabcercle[2] = c1.calculSurface();
		tabcercle[3] = c2.calculSurface();
		tabcercle[4] = c3.calculPerim();
		tabcercle[5] = c3.calculSurface();

		for (int i = 0; i < tabcercle.length; i++) {
			System.out.println(tabcercle[i]);
		}
// fin exercie cercles;
//fin exercice cercleFactory;
	}
}
