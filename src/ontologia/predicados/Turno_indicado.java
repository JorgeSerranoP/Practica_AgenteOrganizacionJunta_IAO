package src.ontologia.predicados;

import src.ontologia.Predicado;
import src.ontologia.conceptos.*;

public class Turno_indicado extends Predicado {
    
	private Marcador_turno marcador;
	
	public Turno_indicado()
	{ ; }

	public Marcador_turno getMarcador() {
		return marcador;
	}

	public void setMarcador(Marcador_turno marcador) {
		this.marcador = marcador;
	}
	
}