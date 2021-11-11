package ontologia.predicados;

import ontologia.conceptos.Jugador;
import ontologia.conceptos.Localizacion;

public class LocalizacionElegida  extends Predicado {
    
	private Localizacion localizacion;
	private Jugador candidato;
	
	public LocalizacionElegida()
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
