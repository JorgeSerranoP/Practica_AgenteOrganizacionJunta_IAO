package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Pueden_ser implements Predicado {
    
	private Jugador jugador;
	private Cartas_politicas cartas;
	private Localizacion localizacion;
	
	public Pueden_ser()
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

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
	
}