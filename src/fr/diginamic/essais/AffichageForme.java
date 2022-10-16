package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme form) {
		System.out.println("le prémiètre de la forme est de "+form.calculPerimetre()+" cm.");
		System.out.println("la surface de la forme est de "+form.calculSurface()+"cm²");
	}

}
