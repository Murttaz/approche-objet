package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1= new ArrayList<Integer>();
		l1.add(-1);
		l1.add(4);
		l1.add(7);
		l1.add(3);
		l1.add(-2);
		l1.add(4);
		l1.add(8);
		l1.add(5);
		
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		int taille= l1.size();
		System.out.println(taille);
		
		int max=0;
		for (int i=0;i<l1.size();i++) {
			if(l1.get(i)>max) {
				max=l1.get(i);
			}
		}
		System.out.println(max);
		
		int min=0;
		for (int i=0;i<l1.size();i++) {
			if(l1.get(i)<min) {
				min=l1.get(i);
			}
		}
		System.out.println(min);
	
	
	for (int i=0;i<l1.size();i++) {
		if(l1.get(i)<0) {
			l1.set(i,Math.abs(l1.get(i)));
		}
System.out.println(l1.get(i));
}
}
}
	


