package org.generation.italy.geometria;

public class Rettangolo {

	/*
	 * Creare una classe Rettangolo con due attributi interi: 
	 * base e altezza. 
	 * Aggiungere un opportuno costruttore con parametri. 
	 * Aggiungere due metodi: 
	 * calcolaArea e calcolaPerimetro 
	 * che calcolano e restituiscono, rispettivamente, 
	 * l’area e il perimetro del rettangolo.
	 */
	
	// attributi
	int base;
	int altezza;
	
	
	// costruttori
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	// metodi
	int calcolaArea() {
		int calcolaArea = base * altezza;
		return calcolaArea;
	}
	
	int calcolaPerimetro() {
		int calcolaPerimetro = (base + altezza) * 2;
		return calcolaPerimetro;
	}
	
	void printTime() {
		System.out.println("Base: " + this.base + "cm" + " Altezza: " +  this.altezza + "cm");
	}
	

}
