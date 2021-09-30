package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.Jugador;
import ontologia.conceptos.Presidente;

public class Asigna_cargo implements Accion {
	private Jugador jugador;
	private Presidente presidente;
	//private Cargo cargo;
	
    public Asigna_cargo()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
    
    
}