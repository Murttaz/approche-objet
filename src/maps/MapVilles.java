package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Integer> mapVille = new HashMap<String, Integer>();
		mapVille.put("Nice", 343000);
		mapVille.put("Carcassonne", 47800);
		mapVille.put("Narbonne", 53400);
		mapVille.put("Lyon", 484000);
		mapVille.put("Foix", 9700);
		mapVille.put("Pau", 77200);
		mapVille.put("Marseille", 850700);
		mapVille.put("Tarbes", 40600);

		Iterator<String> itVilles = mapVille.keySet().iterator();

		int nbHabMin = Integer.MAX_VALUE;
		String petiteville = null;
		while (itVilles.hasNext()) {
			String nomville = itVilles.next();
			Integer ville=mapVille.get(nomville);
			if (ville< nbHabMin) {
				nbHabMin = ville;
				petiteville = nomville;
			}
		}

		System.out.println(" ville la moins peuplée : " + petiteville);

		mapVille.remove(petiteville);

		for (String ville : mapVille.keySet()) {
			System.out.println(ville);
		}
	}
}