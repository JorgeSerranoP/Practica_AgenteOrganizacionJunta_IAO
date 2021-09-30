package ontologia.predicados;

import ontologia.Predicado;
import ontologia.Concepto;
import ontologia.conceptos.*;

public class Asesinado implements Predicado {

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
