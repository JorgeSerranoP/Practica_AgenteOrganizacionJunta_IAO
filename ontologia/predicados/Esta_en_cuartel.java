package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Esta_en_cuartel implements Predicado {
    
	private Cuartel_general cuartel;
	private Jugador jugador;
	public Esta_en_cuartel()
	{ ; }
	public Cuartel_general getCuartel() {
		return cuartel;
	}
	public void setCuartel(Cuartel_general cuartel) {
		this.cuartel = cuartel;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}