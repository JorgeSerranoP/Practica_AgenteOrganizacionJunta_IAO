package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Presidente_escogido implements Predicado {
    
	private Presidente presidente;
	
	public Presidente_escogido()
	{ ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	
}