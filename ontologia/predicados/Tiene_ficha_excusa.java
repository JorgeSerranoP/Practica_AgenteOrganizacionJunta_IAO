package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;
public class Tiene_ficha_excusa implements Predicado {
    
	private Ficha_excusa ficha;
	private Jugador jugador;
	
	public Tiene_ficha_excusa()
	{ ; }

	public Ficha_excusa getFicha() {
		return ficha;
	}

	public void setFicha(Ficha_excusa ficha) {
		this.ficha = ficha;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}