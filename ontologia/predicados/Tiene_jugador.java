package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Tiene_jugador implements Predicado {
    private Jugador jugador;
	private Tablero tablero;

	public Tiene_jugador()
	{ ; }
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
}