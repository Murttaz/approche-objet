package fr.diginamic.banque.entites;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c1 = new Credit("12/10/2022", 122.33);
		Credit c2 = new Credit("10/09/2021", 10000.01);
		Debit d1 = new Debit("13/10/2022", 34.98);
		Debit d2 = new Debit("24/12/2022", 5000.25);

		Operation[] tabOperation = new Operation[4];
		tabOperation[0] = c1;
		tabOperation[1] = d1;
		tabOperation[2] = c2;
		tabOperation[3] = d2;

		for (int i = 0; i < tabOperation.length; i++) {
			System.out.println(tabOperation[i]);
		}
		
		double solde=0;
		for (int j = 0;j<tabOperation.length;j++) {
		
			if(tabOperation[j].getType()=="CREDIT") {
					solde=tabOperation[j].getMontant()+solde;
			}
			else {
				if(tabOperation[j].getType()=="DEBIT") {
					solde=solde-tabOperation[j].getMontant();
			}
		}
		}
		DecimalFormat formateur = new DecimalFormat("0.00",DecimalFormatSymbols.getInstance(Locale.US));
		String montantFormate=formateur.format(solde);
		
		System.out.println("votre solde actuel est de "+ montantFormate);
	}
}

