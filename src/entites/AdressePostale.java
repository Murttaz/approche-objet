package entites;

public class AdressePostale {
	
	int num;
	String nomRue;
	int Cp;
	String city;
	public AdressePostale( int numeroDeRue,String libelleDeRue,int codePostal,String ville) {

	num=numeroDeRue;
	nomRue=libelleDeRue;
	Cp=codePostal;
	city=ville;
	}
	
}
