package ontologia.conceptos;

import ontologia.Concepto;
import ontologia.Predicado;
import ontologia.predicados.*;

public class Cuñado implements Concepto {
	
	private Presidente presidente;
	private Asesinado asesinado;
	
	public Cuñado()
	{ ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Asesinado getAsesinado() {
		return asesinado;
	}

	public void setAsesinado(Asesinado asesinado) {
		this.asesinado = asesinado;
	}
	
}