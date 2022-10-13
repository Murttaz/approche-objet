package fr.diginamic.operations;

public class Operations {
	
	private double a;
	private double b;
	private char operateur;
	private double resultat;
	
	public Operations(double a, double b, char operateur) {

		this.a = a;
		this.b = b;
		this.operateur = operateur;
		
	}

	public double calcul(Double a,Double b,char operateur) {
		switch (operateur){
		case '+' :  resultat=a+b;
		break;
		case '-' : resultat=a-b;
		break;
		case '*' :  resultat=a*b;
		break;
		case'/' : resultat=a/b;
	
		
		}
		return resultat;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
}
