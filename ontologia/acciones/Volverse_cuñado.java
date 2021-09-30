package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Volverse_cuÃ±ado implements Accion {
	
	private Presidente presidente;
	private Cuñado cuñado;
	
    public Volverse_cuÃ±ado()
    { ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Cuñado getCuñado() {
		return cuñado;
	}

	public void setCuñado(Cuñado cuñado) {
		this.cuñado = cuñado;
	}
    
    
}