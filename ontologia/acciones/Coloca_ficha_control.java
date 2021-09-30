package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Coloca_ficha_control implements Accion {
    
	private Presidente presidente;
	//private Cargo cargo;
	
	public Coloca_ficha_control()
    { ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	
	
}