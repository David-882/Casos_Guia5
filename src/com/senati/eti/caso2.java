package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.senati.eti.modelo.Calculadora2;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.print("Primer número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 cal = new Calculadora2(n1, n2);
		
		System.out.println("");
		System.out.println("===================================");
		System.out.println("======= R E S U L T A D O S =======");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("1. Suma......................: " + cal.Operar(1));
		System.out.println("2. Resta.....................: " + cal.Operar(2));
		System.out.println("3. Producto..................: " + cal.Operar(3));
		
		if(cal.getNumero2() == 0) {
			System.out.println("4. Division..................: " + "No es posible");
		}
		else {
			System.out.println("4. Division..................: " + df.format(cal.Operar(4)));
		}
		if(cal.getNumero2() == 0) {
			System.out.println("5. Resto Entero..............: " + "No es posible");
		}
		else {
			System.out.println("5. Resto Entero..............: " + cal.Operar(5));
		}
		
		System.out.println("6. Promedio..................: " + cal.Operar(6));
		System.out.println("7. Suma de cuadrados.........: " + cal.Operar(7));
		System.out.println("8. Diferencia porcentual.....: " + cal.Operar(8) + "%");
		System.out.println("9. El número mayor es........: " + cal.Operar(9));
		System.out.println("10. El número menor es.......: " + cal.Operar(10));
		

	}

}
