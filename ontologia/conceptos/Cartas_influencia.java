package ontologia.conceptos;

import ontologia.Concepto;

public class Cartas_influencia implements Concepto {
	
	private Cartas_politicas carta;
	private Jugador jugador;
	
	public Cartas_influencia()
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

}