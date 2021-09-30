package ontologia.predicados;

import ontologia.Predicado;
import ontologia.Concepto;
import ontologia.conceptos.*;

public class Cartas_repartidas implements Predicado {
    
	private Cartas_politicas cartas;
	
	public Cartas_repartidas()
	{ ; }

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}
	
}