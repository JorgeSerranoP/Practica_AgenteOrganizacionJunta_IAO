package ontologia.predicados;

import ontologia.Predicado;
import ontologia.Concepto;
import ontologia.conceptos.*;

public class Cartas_robadas implements Predicado {
    
	private Jugador jugador;
	private Cartas_politicas cartas;
	
	public Cartas_robadas()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}
	
}