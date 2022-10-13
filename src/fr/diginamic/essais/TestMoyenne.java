package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double moyenne=0.00;
			CalculMoyenne tab1= new CalculMoyenne(new double[] {17.05,13.26,16.25});
			tab1.ajout(17.05);
			tab1.ajout(13.76);
			tab1.ajout(16.25);
			
			moyenne=tab1.calcul();
			
			System.out.println(moyenne);
	}

}
