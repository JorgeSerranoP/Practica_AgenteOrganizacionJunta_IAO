package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Propone_presupuesto implements Accion {
	
	private Presidente presidente;
	private Presupuesto presupuesto;
	
    public Propone_presupuesto()
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
    
    
}