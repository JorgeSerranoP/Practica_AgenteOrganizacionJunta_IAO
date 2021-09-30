package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Ingresa_dinero implements Accion {
	
	private Jugador jugador;
	private Billetes billete;
	private Cuenta_suiza cuenta;
	
    public Ingresa_dinero()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getBillete() {
		return billete;
	}

	public void setBillete(Billetes billete) {
		this.billete = billete;
	}

	public Cuenta_suiza getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta_suiza cuenta) {
		this.cuenta = cuenta;
	}
    
    
}