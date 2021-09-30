package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.Presidente;
import ontologia.conceptos.Presupuesto;

public class Es_mayoria implements Predicado {
    
	private int votos;
	private Candidato candidato;
	
	public Es_mayoria()
	{ ; }

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
}