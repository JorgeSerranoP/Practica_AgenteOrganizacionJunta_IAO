package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Robar_cartas implements Accion {
	
	private Jugador jugador;
	private Cartas_politicas cartas;
	
    public Robar_cartas()
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