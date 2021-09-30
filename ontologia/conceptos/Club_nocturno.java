package ontologia.conceptos;

import ontologia.Concepto;

public class Club_nocturno implements Concepto {
	
	private Localizacion localizacion;
	
	public Club_nocturno()
	{ ; }

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
	
}