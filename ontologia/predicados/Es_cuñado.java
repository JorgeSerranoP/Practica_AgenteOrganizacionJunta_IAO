package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Es_cuñado implements Predicado {
    
	private Cargo presidente;
	private Cargo cuñado;
	public Es_cuñado()
	{ ; }
	public Cargo getPresidente() {
		return presidente;
	}
	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	public Cargo getCuñado() {
		return cuñado;
	}
	public void setCuñado(Cargo cuñado) {
		this.cuñado = cuñado;
	}
	
}