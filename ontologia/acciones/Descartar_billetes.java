package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Descartar_billetes implements Accion {
    
	private Jugador jugador;
	private Billetes billetes; 
	
	public Descartar_billetes()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}
	
	
	
}