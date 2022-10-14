package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
	
		int longueur = chaine.length();
		System.out.println(longueur);
		
		int semic1=chaine.indexOf(";");
		System.out.println(semic1);
		
		String part1=chaine.substring(2,8);
		System.out.println(part1);
		
		String nom=chaine.substring(0, semic1);
		System.out.println(nom);
		
		String nomMaj=nom.toUpperCase();
		System.out.println(nomMaj);
		
		String nomMin=nom.toLowerCase();
		System.out.println(nomMin);
		
		String[] decoupe =chaine.split(";");
		for(int i=0;i<decoupe.length;i++) {
			System.out.println(decoupe[i]);
		}
		
		String montant=chaine.replaceAll(decoupe[2], "2523.5");
		Double salaire1=Double.parseDouble(montant);
		
		Salarie s1 = new Salarie(decoupe[0],decoupe[1],salaire1);
		
		System.out.println(s1);
	
	}
	

}
