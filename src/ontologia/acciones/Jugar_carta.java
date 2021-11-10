package src.ontologia.acciones;

import src.ontologia.Accion;
import src.ontologia.conceptos.*;

public class Jugar_carta extends Accion{
    private Jugador jugador;
	private Cartas_politicas carta;
	
    public Jugar_carta()
    { ; }

    public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}
}
