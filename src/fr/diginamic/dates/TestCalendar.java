package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar date1= Calendar.getInstance();
		date1.set(Calendar.YEAR, 2016);
		date1.set(Calendar.MONTH, 5);
		date1.set(Calendar.DAY_OF_MONTH, 19);
		date1.set(Calendar.HOUR_OF_DAY, 23);
		date1.set(Calendar.MINUTE, 59);
		date1.set(Calendar.SECOND, 30);
		Date date=date1.getTime();
		
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		String datef=format.format(date);
		
		System.out.println(datef);
		
		Calendar date2=Calendar.getInstance();
		Date dates=date2.getTime();
		SimpleDateFormat formatreverse= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datereverse=formatreverse.format(dates);
		
		System.out.println(datereverse);
		
		SimpleDateFormat formatreverseJour= new SimpleDateFormat("EEEE yyyy/MM/dd");
		String datereverseJour=formatreverseJour.format(dates);
		
		System.out.println(datereverseJour);
		
		SimpleDateFormat formatreverseJourFr= new SimpleDateFormat("EEEE yyyy/MM/dd",new Locale("fr", "FR"));
		String datereverseJourFr=formatreverseJourFr.format(dates);
		
		System.out.println(datereverseJourFr);
		
		SimpleDateFormat formatreverseJourRu= new SimpleDateFormat("EEEE yyyy/MM/dd",new Locale("ru", "RU"));
		String datereverseJourRu=formatreverseJourRu.format(dates);
		
		System.out.println(datereverseJourRu);
		

		SimpleDateFormat formatreverseJourCh= new SimpleDateFormat("EEEE yyyy/MM/dd",new Locale("zh", "CN"));
		String datereverseJourCh=formatreverseJourCh.format(dates);
		
		System.out.println(datereverseJourCh);
		
		SimpleDateFormat formatreverseJourDe= new SimpleDateFormat("EEEE yyyy/MM/dd",new Locale("de", "DE"));
		String datereverseJourDe=formatreverseJourDe.format(dates);
		
		System.out.println(datereverseJourDe);
	}

}
