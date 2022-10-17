package tri;

import java.util.ArrayList;
import java.util.List;

public class Ville implements Comparable<Ville> {

	private String Name;
	private int nbHabitant;

	public Ville(String name, int nbHabitant) {
		super();
		Name = name;
		this.nbHabitant = nbHabitant;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return "Ville [Name=" + Name + ", nbHabitant=" + nbHabitant + "]";
	}

	@Override
	public boolean equals(Object city) {
		if (!(city instanceof Ville)) {
			return false;}
	

	Ville o = (Ville) city;
	return ((this.Name==null && o.getName()==null) || this.Name.equals(o.getName()));
	
}

	// compare au nombre d'habitants
	@Override
	public int compareTo(Ville o) {
		return this.nbHabitant - o.getNbHabitant();
	}

}
