package listes;

public class TestEquals {

	public static void main(String[] args) {

		// test equals return true
		Ville ville = new Ville("Nice", 343000);
		Ville o = new Ville("Nice", 343000);

		boolean test = ville.equals(o);
		System.out.println(test);

		// test equals return false
		Ville ville2 = new Ville("Nice", 343000);
		Ville o2 = new Ville("Nic", 343000);

		boolean test2 = ville2.equals(o2);
		System.out.println(test2);

		// test == return false
		boolean test3 = false;

		if (ville == o) {
			test3 = true;
		}
		System.out.println(test3);

		boolean test4 = false;

		if (ville.getNbHabitant() == o.getNbHabitant()) {
			test4 = true;
		}
		System.out.println(test4);
	}

}
