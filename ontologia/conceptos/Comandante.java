package ontologia.conceptos;

import ontologia.Concepto;

public class Comandante implements Concepto {
	
	private Jugador jugador;
	
	public Comandante()
	{ ; }
	
	public Jugador getJugador() {
        return jugador;
    }
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}