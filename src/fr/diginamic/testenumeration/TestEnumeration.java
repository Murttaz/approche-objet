package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values(); // je mets les values dans un contenant de type tableau
		for (Saison saison : saisons) { // je mets une boucle pour lire toutes les cases
			System.out.println(saison);
		}

		
		String nom = "ETE";
		
		Saison saison = Saison.valueOf(nom); // création d'un objet saison pour mettre en lien le nom et son libellé
		
		System.out.println("libellé  : "+saison.getLibelle());
		
		String libelle= "Hiver"; // si pas equalsIgnoreCase dans la emun Saison, attention à la casse!!!
		Saison saison1 = null;
		try {
			saison1 = Saison.trouveLibelle(libelle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("libellé trouvé : "+saison1.getLibelle());
		
		//fin exo 1 enum
	}
}
