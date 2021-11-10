package src.ontologia.predicados;

import src.ontologia.Predicado;
import src.ontologia.conceptos.*;

public class TieneMasDe6Cartas extends Predicado{

    private Cartas_politicas cartas;
	private Jugador jugador;
	
	public TieneMasDe6Cartas()
	{ ; }

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}