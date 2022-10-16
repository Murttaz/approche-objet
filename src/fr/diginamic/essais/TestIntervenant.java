package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[]args) {

	Intervenant is1= new Salarie("Platini","Michel", 1750.47,"CDI");
	Intervenant is2= new Salarie("Tocili","Hector",1450.23,"CDD");
	Intervenant ip= new Pigiste("Aboud","Braz",25,25.13);
	
	System.out.println(is1.getNom()+" "+is1.getPrenom()+" salaire = "+is1.getSalaire()+" Contrat : "+is1.getContrat());
	System.out.println(is2.getNom()+" "+is2.getPrenom()+" salaire = "+is2.getSalaire()+" Contrat : "+is2.getContrat());
	System.out.println(ip.getNom()+" "+ip.getPrenom()+" salaire = "+ip.getSalaire()+" Contrat : "+ip.getContrat());
	
	is1.Afficherdonnees();
	is2.Afficherdonnees();
	ip.Afficherdonnees();
	
	}
}
