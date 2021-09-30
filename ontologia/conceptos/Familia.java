package ontologia.conceptos;

import ontologia.Concepto;

public class Familia implements Concepto {
	
	private Jugador jugador;
	private String nombre;
	
	public Familia()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}