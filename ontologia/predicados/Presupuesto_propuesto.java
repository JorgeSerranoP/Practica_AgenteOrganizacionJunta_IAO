package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Presupuesto_propuesto implements Predicado {
    
	private Presidente presidente;
	private Presupuesto presupuesto;
	
    public Presupuesto_propuesto()
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