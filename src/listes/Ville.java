package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {

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

}
