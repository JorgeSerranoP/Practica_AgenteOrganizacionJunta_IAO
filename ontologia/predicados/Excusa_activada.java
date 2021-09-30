package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Excusa_activada implements Predicado {
    
	private Jugador jugador;
    
	public Excusa_activada()
    { ; }
	
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
    
    
}