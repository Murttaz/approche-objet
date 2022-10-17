package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> l3= new ArrayList<Ville>();
		l3.add(new Ville("Nice",343000));
		l3.add(new Ville("Carcassonne",47800));
		l3.add(new Ville("Narbonne",53400));
		l3.add(new Ville("Lyon",484000));
		l3.add(new Ville("Foix",9700));
		l3.add(new Ville("Pau",77200));
		l3.add(new Ville("Marseille",850700));
		l3.add(new Ville("Tarbes",40600));

		// tri ville 
		Collections.sort(l3);
		for (Ville v: l3) {
			System.out.println(v);
		}
	
		System.out.println("--------------------------");
		// tri alphabétique
		
		
		Collections.sort(l3, new ComparatorNom());
		
		for (Ville v: l3) {
			System.out.println(v);
		}
		System.out.println("--------------------------"); 
		// tri par ordre nb habitant
		Collections.sort(l3, new ComparatorHabitant());
		
		for (Ville v: l3) {
			System.out.println(v);
		}
	}}
		
