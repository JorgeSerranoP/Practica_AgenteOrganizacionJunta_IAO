package ontologia.acciones;

import ontologia.conceptos.Jugador;
import ontologia.Accion;

public class Activar_excusa implements Accion {
	private Jugador jugadorActivador;
    
	public Activar_excusa()
    { ; }
	
	public Jugador getJugadorActivador() {
		return jugadorActivador;
	}
	public void setJugadorActivador(Jugador jugadorActivador) {
		this.jugadorActivador = jugadorActivador;
	}
    
    
}