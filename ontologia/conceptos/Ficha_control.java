package ontologia.conceptos;

import ontologia.Concepto;

public class Ficha_control implements Concepto {
	
	private Cuñado cuñado;
	private String cargo;
	
	public Ficha_control()
	{ ; }

	public Cuñado getCuñado() {
		return cuñado;
	}

	public void setCuñado(Cuñado cuñado) {
		this.cuñado = cuñado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}