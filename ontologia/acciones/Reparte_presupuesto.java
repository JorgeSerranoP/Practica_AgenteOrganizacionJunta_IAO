package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Reparte_presupuesto implements Accion {
	
	private Presidente presidente;
	private Presupuesto presupuesto;
	private Cargo cargo;
	
    public Reparte_presupuesto()
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
    
    
}