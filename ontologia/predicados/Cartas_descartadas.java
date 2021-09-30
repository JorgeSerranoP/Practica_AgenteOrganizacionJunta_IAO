package ontologia.predicados;

import ontologia.Predicado;
import ontologia.Concepto;
import ontologia.conceptos.*;
public class Cartas_descartadas implements Predicado {
    
	private Cartas_politicas carta;
	
	public Cartas_descartadas()
	{ ; }

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}
	
}