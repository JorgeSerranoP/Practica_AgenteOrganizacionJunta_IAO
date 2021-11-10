package src.ontologia.acciones;

import src.ontologia.Accion;
import src.ontologia.conceptos.Ficha_excusa;
import src.ontologia.conceptos.Jugador;

public class Activar_excusa extends Accion {
	
	private Jugador jugadorActivador;
	private Ficha_excusa fichaExcusa;
    
	public Activar_excusa()
    { ; }
	
	public Jugador getJugadorActivador() {
		return jugadorActivador;
	}
	public void setJugadorActivador(Jugador jugadorActivador) {
		this.jugadorActivador = jugadorActivador;
	}

	public Ficha_excusa getFichaExcusa() {
		return fichaExcusa;
	}

	public void setFichaExcusa(Ficha_excusa fichaExcusa) {
		this.fichaExcusa = fichaExcusa;
	}
    
}