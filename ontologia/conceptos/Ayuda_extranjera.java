package ontologia.conceptos;

import ontologia.Concepto;

public class Ayuda_extranjera implements Concepto {
	
	private Billetes presupuesto;
	private Presidente presidente;
	
	public Ayuda_extranjera()
	{ ; }

	public Billetes getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Billetes presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	
	
}