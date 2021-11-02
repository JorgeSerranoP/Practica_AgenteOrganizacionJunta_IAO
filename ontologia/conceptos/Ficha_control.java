package ontologia.conceptos;

import ontologia.Concepto;

public class Ficha_control implements Concepto {
	
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