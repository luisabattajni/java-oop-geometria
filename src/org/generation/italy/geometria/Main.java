package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Creare una classe Main contenente il metodo main(), 
		 * nel quale chiedete all’utente di inserire, da console, 
		 * i valori di base e di altezza 
		 * con cui istanziare un nuovo Rettangolo. 
		 * Dopo averlo istanziato, stampate a video 
		 * il perimetro e l’area.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Inserire la base del rettangolo: ");
		int b = scan.nextInt();
		System.out.println("Inserire l'altezza del rettangolo: ");
		int h = scan.nextInt();
		
		
		
		Rettangolo r = new Rettangolo(b, h);
		r.printTime();
		
		int p = r.calcolaPerimetro();
		System.out.println("Il perimetro è " + p + " cm");
		
		int a = r.calcolaArea();
		System.out.println("L'area è " + a + " cm");
		
		
		
		
		scan.close();
		
		
		
	}

}
