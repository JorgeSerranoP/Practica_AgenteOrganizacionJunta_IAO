package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Volverse_cuñado implements Accion {
	
	private Presidente presidente;
	private Cu�ado cu�ado;
	
    public Volverse_cuñado()
    { ; }

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Cu�ado getCu�ado() {
		return cu�ado;
	}

	public void setCu�ado(Cu�ado cu�ado) {
		this.cu�ado = cu�ado;
	}
    
    
}