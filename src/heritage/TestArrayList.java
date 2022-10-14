package heritage;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		/*rajout de string dans une liste
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("coucou");
		liste.add("bonjour");
		*/
		User u1 = new User("Lee","Rock");
		
		// rajout d'un autre type dans la liste
		ArrayList <User> liste = new ArrayList<User>();
		liste.add(u1);
		liste.add(new User("Dux","Rick"));
		liste.add(new User("Pottier","Matthew"));
		
		
	}

}
