package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> nombre= new HashSet<Double>();
		nombre.add(1.5);
		nombre.add(8.25);
		nombre.add(-7.32);
		nombre.add(13.3);
		nombre.add(-12.45);
		nombre.add(48.5);
		nombre.add(0.01);
		
		//for (Double nbr : nombre ) {
		//	System.out.println(nbr);
		//}
		
		Iterator<Double> it= nombre.iterator();
		
		double max= Double.MIN_VALUE;
		double min;
		while(it.hasNext()) {
			if (max<it.next()) {
				max=it.next();
			}
			
		}
		System.out.println(max);
	
	}

}
