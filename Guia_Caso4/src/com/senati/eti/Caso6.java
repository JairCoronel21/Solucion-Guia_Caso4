package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		
		String[][] mdatos = { {"Joe Castillo", "Rosa Perez", "Carlos Flores"},
				              {"Callao", "SMP", "Comas"} };
		
		System.out.println("\nImpresión por filas");
		System.out.println("---------------------");
		
		//mDatos.lenght    ----> Número de filas (2)
		//mDatos[0].lenght  ----> Número de columnas (3)
		
		for (int i = 0; i < mdatos.length; i++) {
			for (int j = 0; j < mdatos[0].length; j++) 
				System.out.print(String.format("%-20s", mdatos[i] [j]) + "\t");
				
				System.out.println();
				
				
			}
			
		System.out.println("\nImpresión por columnas");
		System.out.println("------------------------");
			
		

		for (int c = 0; c < mdatos[0].length; c++) {
			for (int f = 0; f < mdatos.length; f++) 
				System.out.print(String.format("%-20s", mdatos[f] [c]) + "\t");
				
				System.out.println();
				
		}
		
		
}		
		
}		
	


