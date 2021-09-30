package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Vota_presidente implements Accion {
	
	private Jugador jugador;
	private Candidato candidato;
	
    public Vota_presidente()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
    
    
}