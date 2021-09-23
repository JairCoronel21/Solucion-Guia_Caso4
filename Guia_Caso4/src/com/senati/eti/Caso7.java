package com.senati.eti;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir una matriz de numeros 3x4
		
		int[][] mNumeros  = new int [3][4]; 
         int num_mayor = 0;
		 int num_menor = 9999999;
		 int sumatoria = 0;
		 float promedio = 0;
		 
		System.out.println("\nLectura de n�meros");
		System.out.println("--------------------");
		
		
		
		for (int f = 0; f < mNumeros.length; f++) {
		  System.out.println("\nFila " + (f + 1) + ": ");
		  System.out.println("------------------------");
				
		  for (int c = 0; c < mNumeros[0].length; c++) {
			  System.out.println("N�mero " + (c + 1) + ": ");
			 mNumeros[f][c] = sc.nextInt();
			 
			 
			 if ( f == 0 && c == 0 ) {
				 num_mayor = mNumeros[0][0];
			 } else {
				 if (mNumeros[f][c] > num_mayor)  num_mayor = mNumeros[f][c];
			 }
			
			 if ( f == 0 && c == 0 ) {
				 num_menor = mNumeros[0][0];
			 }  else {
				 if  (mNumeros[f][c] < num_menor)  num_menor = mNumeros[f][c];
			 }
			 
			 if ( f == 0 && c == 0 ) {
				 sumatoria = mNumeros[0][0];
			 }  else {
				   sumatoria += mNumeros[f][c];
			 }
			 
			 if ( f == 0 && c == 0 ) {
				 promedio = mNumeros[0][0];
			 }  else {
				  promedio = sumatoria / 12;
			 }
			 
		  }
		}

		
		System.out.println("\nRESULTADOS");
		System.out.println("--------------");
		System.out.println("N�mero mayor: " + num_mayor);
		System.out.println("N�mero menor: " + num_menor);
		System.out.println("Sumatoria: " + sumatoria);
		System.out.println("Promedio: " + promedio);
			
		}	
	


}

