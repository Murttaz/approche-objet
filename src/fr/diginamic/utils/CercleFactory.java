package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	// méthode avec param double et retrun cercle
	public static Cercle retourcercle(double rayon) {
		
		return new Cercle(rayon);
	}
	

}
