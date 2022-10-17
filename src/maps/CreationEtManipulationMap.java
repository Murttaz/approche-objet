package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		// TODO Auto-generated method stub
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			int dpt = keysIte.next();
			System.out.println(dpt);
		}

		System.out.println("---------------------");

		Iterator<String> valuesIte = mapVilles.values().iterator();
		while (valuesIte.hasNext()) {
			String ville = valuesIte.next();
			System.out.println(ville);
		}

	}

}
