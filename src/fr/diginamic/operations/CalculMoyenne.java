package fr.diginamic.operations;

public class CalculMoyenne {

	double[] tab ; // attribut
	double somme = 0.00;
	double moyenne = 0.00;

	// constructeur
	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}

	// méthode d'ajout dans le tableau
	public void ajout(double rajout) {
		double[] nvtab = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			nvtab[i] = tab[i];
		}
		nvtab[nvtab.length - 1] = rajout;
		this.tab = nvtab;
	}

	// méthode pour faire le calcul de la moyenne
	public double calcul() {
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		moyenne = somme / tab.length;
		return moyenne;
	}

	public double[] getTab() {
		return tab;
	}

	public void setTabdeDouble(double[] tab) {
		tab = tab;
	}
}
