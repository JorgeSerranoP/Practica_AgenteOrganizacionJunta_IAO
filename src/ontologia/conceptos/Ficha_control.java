package src.ontologia.conceptos;

import src.ontologia.Concepto;

public class Ficha_control extends Concepto {
	
	private Cargo cuñado;
	private Cargo cargo;
	
	public Ficha_control()
	{ ; }

	public Cargo getCuñado() {
		return cuñado;
	}

	public void setCuñado(Cargo cuñado) {
		this.cuñado = cuñado;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}