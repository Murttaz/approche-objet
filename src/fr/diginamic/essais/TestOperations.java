package fr.diginamic.essais;

import fr.diginamic.operations.*;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Operations op1 = new Operations(2.75,3.33,'+');
		Operations op2 = new Operations(12.57,8.88,'-');
		Operations op3 = new Operations(1.3,3.33,'*');
		Operations op4 = new Operations(5.12,0.23,'/');
		
		Double[] calcOpe=new Double[4];
		calcOpe[0]=op1.calcul(2.75, 3.33, '+');
		calcOpe[1]=op2.calcul(12.57, 8.88, '-');
		calcOpe[2]=op3.calcul(1.3, 3.33, '*');
		calcOpe[3]=op4.calcul(5.12, 0.23, '/');
		
		
		for(int i=0;i<calcOpe.length;i++) {
			System.out.println(calcOpe[i]);
		}
	}
	// fin exo operations

}
