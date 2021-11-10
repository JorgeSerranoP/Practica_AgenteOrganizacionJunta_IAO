package src.ontologia.predicados;

import src.ontologia.Predicado;
import src.ontologia.conceptos.*;

public class Asesinado extends Predicado {

	private Jugador jugador;

	public Asesinado()
	{ ; }
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}
