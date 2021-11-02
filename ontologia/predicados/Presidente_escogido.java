package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Presidente_escogido implements Predicado {
    
	private Cargo presidente;
	
	public Presidente_escogido()
	{ ; }

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	
}