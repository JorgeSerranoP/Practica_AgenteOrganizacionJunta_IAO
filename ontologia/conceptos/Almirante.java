package ontologia.conceptos;

import ontologia.Concepto;

public class Almirante implements Concepto {
	
	private Jugador jugador;
	
	public Almirante()
	{ ; }
	
	public Jugador getJugador() {
        return jugador;
    }
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}