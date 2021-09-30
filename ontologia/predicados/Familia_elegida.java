package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Familia_elegida implements Predicado {
    
	private Familia familia;
	private Jugador jugador;
	
	public Familia_elegida()
	{ ; }

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}