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
	public int getNumeroRue() {
		return num;
	}
	public int getCP() {
		return Cp;
	}
	public String getNomRue() {
		return nomRue;
		
	}
	public String getCity() {
		return city;
	}
	public void setNumeroRue(int numeroDeRue) {
		this.num=numeroDeRue;
	}
	public void setCP(int codePostal) {
		this.Cp=codePostal;
	}
	public void setNomRue(String nomRue) {
		this.nomRue=nomRue;
	}
	public void setCity (String ville) {
		this.city=ville;
	}
}
