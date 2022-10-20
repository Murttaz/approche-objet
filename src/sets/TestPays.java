package sets;

import java.util.HashSet;

public class TestPays {
	
	public static void main(String[] args) {

	HashSet<Pays> set= new HashSet<Pays>();
	
	set.add(new Pays("USA",337_550_940,20.94));
	set.add(new Pays("France",67_813_396,2.603));
	set.add(new Pays("Allemagne",83_809_425,3.806));
	set.add(new Pays("UK",68_702_825,2.708));
	set.add(new Pays("Italie",60_634_688,1.886));
	set.add(new Pays("Japon",126_219_457,5.056));
	set.add(new Pays("Chine",1_412_000_000,14.72));
	set.add(new Pays("Russie",146_083_065,1.483));
	set.add(new Pays("Inde",1_380_000_000,2.623));
	
	Pays paysPIBmax=set.iterator().next(); // prendre la première donnée
	
	for (Pays pays : set){ // comparer aux autres
		if(paysPIBmax.getPIBHab()<pays.getPIBHab()) {
			paysPIBmax=pays;
		}
	}
	System.out.println("Pays avec le plus de PIB : "+paysPIBmax);
	
	System.out.println("--------------------------");
	
	Pays pibmaxparhab=set.iterator().next(); // prendre le premier de la liste
	
	for (Pays pays : set){ // comparer aux autres
		if(pibmaxparhab.getPibTotal()<pays.getPibTotal()) {
			pibmaxparhab=pays;
		}
		}
	System.out.println("Pays avec le plus de PIB par hab : "+pibmaxparhab);
	System.out.println("--------------------------");
	
	Pays pibminparhab=set.iterator().next(); // prendre le premier de la liste
	
	for (Pays pays : set){ // comparer aux autres
		if(pibminparhab.getPibTotal()>pays.getPibTotal()) {
			pibminparhab=pays;
		}
		}
	
	String maj = pibminparhab.getNom().toUpperCase();
	pibminparhab.setNom(maj);
	System.out.println("Pays avec le plus petit PIB par habitant : " +pibminparhab);
	System.out.println("--------------------------");
	
	set.remove(pibminparhab);
	
	for (Pays pays : set) {

		System.out.println(pays);
	}
}
	
}
