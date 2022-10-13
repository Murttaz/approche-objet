package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre th1=new Theatre ("Graslin",150,60,750.00);
		
		th1.inscrire(30, 12.50);
		System.out.println(th1.getTotalclient()+" "+th1.getRecette());
		th1.inscrire(30, 12.50);
		System.out.println(th1.getTotalclient()+" "+th1.getRecette());
		th1.inscrire(30, 12.50);
		System.out.println(th1.getTotalclient()+" "+th1.getRecette());
		th1.inscrire(30, 12.50);
		System.out.println(th1.getTotalclient()+" "+th1.getRecette());
		
	}

}
