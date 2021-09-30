package ontologia.conceptos;

import ontologia.Concepto;
import ontologia.Predicado;
import ontologia.predicados.*;

public class Exilio implements Concepto {
	
	private Jugador jugador;
	private Localizacion localizacion;
	
	public Exilio()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
	
	
}