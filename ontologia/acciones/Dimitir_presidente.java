package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Dimitir_presidente implements Accion {
	
	private Cargo presidente;
	
    public Dimitir_presidente()
    { ; }

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
    
}