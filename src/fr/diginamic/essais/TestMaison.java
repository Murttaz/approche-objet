package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Sdb;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maison maison=new Maison();
		
		//maison.ajouterpiece(null);
		// donne une erreur de nullpointerexeption;
		//maison.ajouterpiece(new Chambre(-1, 9.5));
		//maison.ajouterpiece(new Chambre(1, -9.5));
		// il y a d'autres erreurs
		
		//mesure de la maison de chez mes parents à Nantes
		maison.ajouterpiece(new Chambre(1, 9.5));
		maison.ajouterpiece(new Cuisine(0, 15.5));
		maison.ajouterpiece(new Sdb(1, 2.5));
		maison.ajouterpiece(new Wc(0, 1.25));
		maison.ajouterpiece(new Salon(0, 30.5));
		maison.ajouterpiece(new Chambre(1, 10.7));
		maison.ajouterpiece(new Chambre(1, 8.4));
		maison.ajouterpiece(new Chambre(1, 11.3));
		maison.ajouterpiece(new Wc(1, 1.5));
		
		System.out.println("Superficie Total: " + maison.surftotale());
		System.out.println("Superficie de l'étage 0: " + maison.superficieEtage(0));
		System.out.println("Superficie de l'étage 1: " + maison.superficieEtage(1));
		System.out.println("Superficie des chambres: " + maison.superficieTypePiece(Piece.Type_Chambre));
	}

}
