package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Se_exilia implements Accion {
	
	private Jugador jugador;
	private Exilio exilio;
	
    public Se_exilia()
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