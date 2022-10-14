package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
	public static void main(String args[]) {
		
		List<String> liste1= new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2= new ArrayList<String>();
		liste2.add("Blanc"); 
		liste2.add("Bleu");
		liste2.add("Orange");//TODODéveloppements à réaliser ci-dessous}
		
		List<String> liste3=new ArrayList<String>();
		
		Iterator<String> it1 = liste1.iterator();
		while(it1.hasNext()) {
			liste3.add(it1.next());
		}
		Iterator<String> it2 = liste2.iterator();
		
	while (it2.hasNext()) {
		liste3.add(it2.next());
	}
	
	for (int i=0;i<liste3.size();i++) {
		System.out.println(liste3.get(i));
	}
	}
}
