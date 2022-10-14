package listes;

import java.util.ArrayList;
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

		
		Ville vmax=l3.get(0);
		for(int i=0;i<l3.size();i++) {
			if(l3.get(i).getNbHabitant()>vmax.getNbHabitant()) {
				vmax=l3.get(i);
			}
		}
		System.out.println(vmax.getName()+" "+vmax.getNbHabitant());
		
		
		Ville vmin=l3.get(0);
		for(int i=0;i<l3.size();i++) {
			if(l3.get(i).getNbHabitant()<vmin.getNbHabitant()) {
				vmin=l3.get(i);
			}			
	}
		Iterator<Ville> it=l3.iterator();
		while(it.hasNext()) {
			if(it.next().getNbHabitant()==vmin.getNbHabitant()) {
				it.remove();
			}
			}
		
		
		Iterator<Ville> it2=l3.iterator();
		while(it2.hasNext()) {
			if(it2.next().getNbHabitant()>100000) {
				it2.next().getName().toUpperCase();
			}
			}
		
		for (int i=0;i<l3.size();i++){
			System.out.println(l3.get(i));
		}
	}}
		
