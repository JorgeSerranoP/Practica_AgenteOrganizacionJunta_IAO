package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Exiliado implements Predicado {
    
	private Jugador jugador;
	private Exilio exilio;
	
    public Exiliado()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Exilio getExilio() {
		return exilio;
	}

	public void setExilio(Exilio exilio) {
		this.exilio = exilio;
	}
}