package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {

	public Mano() {
		// CREAMOS UNA LIST DE CARTAS VACÍA.
		this.cartas = new ArrayList<Carta>();
	}
	
	public int valorMano() throws Masde21Exception {
		int valor=0;
		int numAses=0;
		for(Carta c : this.cartas) {
			if (c.getNumero()==1) {
				numAses++;
			}
			valor = valor + c.getValor();
		
		if (valor>21) {
			throw new Masde21Exception();
		}
		return valor;
	}
	
	public boolean finDeJuego() {
		if (valorMano()>=21) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Mano [" + cartas + "]Valor de la mano:"+valorMano;
	}
	
	
	
}
