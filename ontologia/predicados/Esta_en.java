package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.Jugador;
import ontologia.conceptos.Localizacion;

public class Esta_en  implements Predicado {
    
	private Localizacion localizacion;
	private Jugador candidato;
	
	public Esta_en()
	{ ; }

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public Jugador getCandidato() {
		return candidato;
	}

	public void setCandidato(Jugador candidato) {
		this.candidato = candidato;
	}

}
