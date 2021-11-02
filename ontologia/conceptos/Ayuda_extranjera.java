package ontologia.conceptos;

import ontologia.Concepto;

public class Ayuda_extranjera implements Concepto {
	
	private Billetes presupuesto;
	private Cargo presidente;
	
	public Ayuda_extranjera()
	{ ; }

	public Billetes getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Billetes presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	
	
}