package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Dinero_repartido implements Predicado {
    

	private Presidente presidente;
	private Presupuesto presupuesto;
	private String cargo;
	
	public Dinero_repartido()
	{ ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}