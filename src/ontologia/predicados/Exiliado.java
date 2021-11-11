package ontologia.predicados;

import ontologia.conceptos.*;

public class Exiliado extends Predicado {
    
	private Jugador jugador;
	private Localizacion exilio;
	
    public Exiliado()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Localizacion getExilio() {
		return exilio;
	}

	public void setExilio(Localizacion exilio) {
		this.exilio = exilio;
	}
	
	
    
    
}