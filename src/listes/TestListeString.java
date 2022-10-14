package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Nice");
		l2.add("Carcassone");
		l2.add("Narbonne");
		l2.add("Lyon");
		l2.add("Foix");
		l2.add("Pau");
		l2.add("Marseille");
		l2.add("Tarbes");
		
		int maxlettre=0;
		String select=null;
		for (int i=0;i<l2.size();i++) {
			String nomcity=l2.get(i);
			if (nomcity.length()>maxlettre) {
				maxlettre=nomcity.length();
				select=nomcity;
			}
		}
		System.out.println(select);
		
		
		for (int i=0;i<l2.size();i++) {
			 String nomcity=l2.get(i);
			l2.set(i, nomcity.toUpperCase());
		}
		
		Iterator<String> it=l2.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("N")) {
				it.remove();
			}
		}
		
		for (int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
		
		
		
	}
	
}
