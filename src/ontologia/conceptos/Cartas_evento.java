package ontologia.conceptos;

public class Cartas_evento extends Concepto {
	
	private Cartas_politicas carta;
	private Jugador jugador;
	
	public Cartas_evento()
	{ ; }
	
	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}