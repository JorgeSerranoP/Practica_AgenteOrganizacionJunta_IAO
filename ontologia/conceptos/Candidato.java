package ontologia.conceptos;

import ontologia.Concepto;

public class Candidato implements Concepto {
	
	private Jugador jugador;
	private int votos;
	
	public Candidato()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
	
}