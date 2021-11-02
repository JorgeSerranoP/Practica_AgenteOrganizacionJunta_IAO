package ontologia.conceptos;

import ontologia.Concepto;

public class Ficha_excusa implements Concepto {
	
	private boolean estado;
	
	public Ficha_excusa()
	{ ; }

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}