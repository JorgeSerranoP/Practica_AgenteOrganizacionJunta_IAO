package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Propone_candidatos implements Accion {
	
	private Jugador jugador;
	private Candidato candidato;
	
    public Propone_candidatos()
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