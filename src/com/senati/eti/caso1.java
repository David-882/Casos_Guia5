package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.senati.eti.modelo.Calculadora1;

public class caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Calculadora1 calc = new Calculadora1();
		
		System.out.print("Primer número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		float n2 = sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\nNÚMEROS INGRESADOS");
		System.out.println("==================");
		System.out.println("Número1..........: " + calc.getNumero1());
		System.out.println("Número2..........: " + calc.getNumero2());
		System.out.println("\nRESULTADOS");
		System.out.println("==========");
		System.out.println("Suma..............: " + calc.Suma());
		System.out.println("Resta.............: " + calc.Resta());
		System.out.println("Producto..........: " + calc.Producto());
		
		if(calc.getNumero2() == 0) {
			System.out.println("Division..........: " + "No es posible");
		}
		else {
			System.out.println("Division..........: " + df.format(calc.Division()));
		}
		if(calc.getNumero2() == 0) {
			System.out.println("Resto Entero......: " + "No es posible");
		}
		else {
			System.out.println("Resto Entero......: " + calc.RestoEntero());
		}
		
		System.out.println("El número mayor es: " + calc.NumMayor());
		System.out.println("El número menor es: " + calc.NumMenor());

	}

}
