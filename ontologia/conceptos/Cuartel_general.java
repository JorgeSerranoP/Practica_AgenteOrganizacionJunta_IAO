package ontologia.conceptos;

import ontologia.Concepto;

public class Cuartel_general implements Concepto {
	
	private Localizacion localizacion;
	private boolean inicio_golpe;
	
	public Cuartel_general ()
	{ ; }

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public boolean isInicio_golpe() {
		return inicio_golpe;
	}

	public void setInicio_golpe(boolean inicio_golpe) {
		this.inicio_golpe = inicio_golpe;
	}
	
}