package org.lessons.java.shop;

class Prodotto {
		
	//Dichiarazione proprietà della classe
	int code;
	String name;
	String description;
	double price;
	double tax;
	
	//Costruttore
	Prodotto(String name, String description, double price, double tax) {
		//Inizializzazione codice prodotto e generazione di un numero random compreso tra 100 e 999
		this.code = 100 + (int)(Math.random() * 900);
		//Inizializzazione delle restanti proprietà
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}
	
	//Metodo che restituisce il prezzo
	double getPrice() {
		return price;
	}
	
	//Metodo che restituisce il prezzo compreso di tassa iva arrotondato a due cifre decimali
	double getFullPrice() {
		price += price * (tax / 100);
		return Math.floor(price * 100) / 100;
	}

	//Metodo che restituisce il codice-nome
	String getFullName () {
		return code + "-" + name;
	}
	

}
