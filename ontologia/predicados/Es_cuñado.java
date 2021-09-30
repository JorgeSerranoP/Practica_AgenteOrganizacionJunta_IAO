package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Es_cuñado implements Predicado {
    
	private Presidente presidente;
	private Cuñado cuñado;
	public Es_cuñado()
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