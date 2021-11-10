package src.ontologia.acciones;

import src.ontologia.Accion;

public class Empezar_partida extends Accion{
    private int jugadores;
	
    public Empezar_partida()
    { ; }

	public int getNumJugadores() {
		return jugadores;
	}

	public void setNumJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
}
