package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	private double salaireMensuel;
	private String typeContrat;

	public Salarie(String nom, String prenom,double salaireMensuel,String typeContrat) {
		super(nom, prenom);
		this.salaireMensuel=salaireMensuel;
		this.typeContrat=typeContrat;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}


	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaireMensuel;
	}
	
	@Override
	public String getContrat() {
		// TODO Auto-generated method stub
		return this.typeContrat;
	}
	
	

}
