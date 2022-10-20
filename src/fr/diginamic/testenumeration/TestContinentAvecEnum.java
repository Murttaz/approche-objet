package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> ville=new ArrayList<Ville>();
		
		 ville.add(new Ville("New York",8_804_190,Continent.AMERIQUE));
		 ville.add(new Ville("Paris",2_165_423,Continent.EUROPE));
		 ville.add(new Ville("Moscou",12_655_050,Continent.ASIE));
		 ville.add(new Ville("Beijing",21_700_000,Continent.ASIE));
		 ville.add(new Ville("Berlin",3_748_148,Continent.EUROPE));
		 ville.add(new Ville("Sydney",5_312_163,Continent.OCEANIE));
		 ville.add(new Ville("Sao Paulo",11_895_893,Continent.AMERIQUE));
		 ville.add(new Ville("Dakar",1_056_009,Continent.AFRIQUE));
		 
		 for (Ville villes : ville) {
			 System.out.println(villes);
		 }
		 
		 
	}

}
