package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		//Creazione del prodotto
		Prodotto prodotto1 = new Prodotto("Geniale", "Prodotto del secolo", 100.50, 50);
		
		//Stampa del prezzo
		System.out.println(prodotto1.getPrice());
		
		//Stampa del prezzo comprensivo di IVA
		System.out.println(prodotto1.getFullPrice());
		
		//Stampa del codice-nome
		System.out.println(prodotto1.getFullName());
		
		//Stampa della descrizione del prodotto
		System.out.println(prodotto1.description);

	}

}
