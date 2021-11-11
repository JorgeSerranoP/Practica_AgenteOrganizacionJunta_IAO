package ontologia.acciones;

import ontologia.conceptos.*;

public class Descartar_cartas extends Accion {
	
	private Jugador jugador;
	private Cartas_politicas carta;
	
    public Descartar_cartas()
    { ; }

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
    
}