package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Forzar_presupuesto implements Accion {
	
	private Ministro_interior ministro;
	private Presupuesto presupuesto;
	
    public Forzar_presupuesto()
    { ; }

	public Ministro_interior getMinistro() {
		return ministro;
	}

	public void setMinistro(Ministro_interior ministro) {
		this.ministro = ministro;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
    
    
}