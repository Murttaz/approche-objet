package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte c1 = new Compte(142857, 1587.23);

		CompteTaux c2 = new CompteTaux(758241, 1313.13, 1.75);
	
	Compte[] tabCompte=new Compte[2];
	tabCompte[0]=c1;
	tabCompte[1]=c2;
	
	for(int i=0;i<tabCompte.length;i++) {
		System.out.println(tabCompte[i]);
	}
	
	}

}
