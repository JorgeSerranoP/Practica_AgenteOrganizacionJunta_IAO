package ontologia.conceptos;

import ontologia.Concepto;

public class Cartas_asesino implements Concepto {
	
	private Cartas_politicas carta;
	private Jugador jugador;
	private int valor;
	
	public Cartas_asesino()
	{ ; }

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}