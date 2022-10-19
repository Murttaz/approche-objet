package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1= new Date();
		
		SimpleDateFormat formatdeDate=new SimpleDateFormat("dd/MM/yyyy"); // mise au format voulu
		String dateauFormat=formatdeDate.format(date1); // on applique le format à la date récupérée
		
		System.out.println(dateauFormat);
		
		Date datedonnee=new Date(116,4,19,23,59,30);
		
		SimpleDateFormat formatdeDateHeure=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // mise au format voulu
		String dateauFormatHeure=formatdeDateHeure.format(datedonnee); // on applique le format à la date récupérée
		
		System.out.println(dateauFormatHeure);
		
		SimpleDateFormat formatdeDateHeurereverse=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // mise au format voulu
		String dateauFormatHeurereverse=formatdeDateHeurereverse.format(datedonnee); // on applique le format à la date récupérée
		
		System.out.println(dateauFormatHeurereverse);
		

		
		SimpleDateFormat formatdeDateActuellereverse=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // mise au format voulu
		String dateauFormatactuellereverse=formatdeDateActuellereverse.format(date1); // on applique le format à la date récupérée
		
		System.out.println(dateauFormatactuellereverse);
	}

}
