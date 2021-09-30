package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Vuelve_exilio implements Accion {
	
	private Jugador jugador;
	private Exilio exilio;
	private Localizacion localizacion;
	
    public Vuelve_exilio()
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

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
    
    
}