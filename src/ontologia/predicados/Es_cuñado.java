package src.ontologia.predicados;

import src.ontologia.Predicado;
import src.ontologia.conceptos.*;

public class Es_cuñado extends Predicado {
    
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