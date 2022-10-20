package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	private String Name;
	private int nbHabitant;
	private Continent continent;

	public Ville(String name, int nbHabitant, Continent continent) {
		super();
		Name = name;
		this.nbHabitant = nbHabitant;
		this.continent=continent;
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return Name+" : "+ nbHabitant+" habitants, continent : "+continent.getLibelle();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville o = (Ville) obj;
		return o.getName().equals(this.Name) && o.getNbHabitant() == this.nbHabitant && o.getContinent().equals(this.continent);
	}
}
