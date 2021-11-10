package src.ontologia.conceptos;

import src.ontologia.Concepto;
import src.ontologia.predicados.*;

public class Golpe extends Concepto {
	
	private Excusa_activada excusa_activada;
	private LocalizacionElegida cuartel;
	
	public Golpe()
	{ ; }

	public Excusa_activada getExcusa_activada() {
		return excusa_activada;
	}

	public void setExcusa_activada(Excusa_activada excusa_activada) {
		this.excusa_activada = excusa_activada;
	}

	public LocalizacionElegida getEn_cuartel() {
		return cuartel;
	}

	public void setEn_cuartel(LocalizacionElegida cuartel) {
		this.cuartel = cuartel;
	}
	
}