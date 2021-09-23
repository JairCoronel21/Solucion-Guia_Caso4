package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A001", "A002", "A003", "A004", "A005"};
		String[] arrNombre = {"Carlos Torres", "Maria Flores", "Cecilia Bravo", "Felipe Vargas", "Rosa Garcia"};
		String estado = "";
		int[] arrNota = {8, 14, 10, 19, 11};
		
		
		System.out.println("Consulta de datos");
		System.out.println("--------------------------");
		System.out.println("Ingrese el código a buscar: ");
		
		String codigo = sc.nextLine();
		
		
	
		
		int  p = -1;  
		
		for(int i = 0; i < arrCodigo.length; i++) {
			if (codigo.equals(arrCodigo[i])) {
				p = i;
				break;
				
				
			}
			
			
		
		
		  }
		   
		
		
		if ( p == -1) {
			System.out.println("\nCódigo no Encontrado");
		} else {
			System.out.println("\nCódigo Encontrado");
			
			if (arrNota[p] > 10)
			  estado = "Aprobado";
			else 
				estado = "Desaprobado";
			
			System.out.println("-------------------");
			System.out.println("Alumno(a):.........:" + arrNombre[p]);
			System.out.println("Nota:..............:" + arrNota[p]);
			System.out.println("Estado:............:" + estado);
		    
			
		}
	}

}
