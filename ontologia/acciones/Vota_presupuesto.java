package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Vota_presupuesto implements Accion {
	
	private Presupuesto presupuesto;
	private Jugador jugador;
	
    public Vota_presupuesto()
    { ; }

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
    
    
}