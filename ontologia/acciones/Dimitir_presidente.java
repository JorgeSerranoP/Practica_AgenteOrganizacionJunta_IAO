package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Dimitir_presidente implements Accion {
	
	private Presidente presidente;
	
    public Dimitir_presidente()
    { ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
    
    
}