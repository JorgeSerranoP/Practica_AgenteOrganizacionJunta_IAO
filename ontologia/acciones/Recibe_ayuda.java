package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Recibe_ayuda implements Accion {
	
	private Presidente presidente;
	private Billetes billete;
	
    public Recibe_ayuda()
    { ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Billetes getBillete() {
		return billete;
	}

	public void setBillete(Billetes billete) {
		this.billete = billete;
	}
    
    
}