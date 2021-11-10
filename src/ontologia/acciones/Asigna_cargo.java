package src.ontologia.acciones;

import src.ontologia.Accion;
import src.ontologia.conceptos.Cargo;
import src.ontologia.conceptos.Jugador;

public class Asigna_cargo extends Accion {
	private Jugador jugador;
	private Cargo cargo;
	
    public Asigna_cargo()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}