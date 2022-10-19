package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut= System.currentTimeMillis();

		StringBuilder builder=new StringBuilder();
		for(int i =1;i<=100000;i++) {
			builder.append(i);
		}
		
		long fin= System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes :"+ (fin-debut));
		//resultat 17  millisecondes
		
		
		debut = System.currentTimeMillis();
		String phrase= new String();
		for(int i =1;i<=100000;i++) {
			phrase+=i;
		}
		fin= System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes :"+ (fin-debut));
	}
	// temps écoulé 7190 millisecondes
	
	// les résultats sont très différents ! le String builder rend le traitement beaucoup plus rapide!

}
