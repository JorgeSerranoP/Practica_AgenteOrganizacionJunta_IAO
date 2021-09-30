package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Elegir_familia implements Accion {
    
	private Jugador jugador;
    private Familia familia;
    
	public Elegir_familia()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	
	
}