package ontologia.acciones;

import ontologia.conceptos.*;

public class Descartar_cartas extends Accion {
	
	private Jugador jugador;
	private Cartas_politicas carta;
	private boolean quiereDescartar;
	
    public Descartar_cartas()
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

	public boolean getQuiereDescartar() {
		return quiereDescartar;
	}

	public void setQuiereDescartar(boolean quiereDescartar) {
		this.quiereDescartar = quiereDescartar;
	}
    
}