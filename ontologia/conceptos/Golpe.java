package ontologia.conceptos;

import ontologia.Concepto;
import ontologia.predicados.*;

public class Golpe implements Concepto {
	
	private Excusa_activada excusa_activada;
	private Esta_en cuartel;
	
	public Golpe()
	{ ; }

	public Excusa_activada getExcusa_activada() {
		return excusa_activada;
	}

	public void setExcusa_activada(Excusa_activada excusa_activada) {
		this.excusa_activada = excusa_activada;
	}

	public Esta_en getEn_cuartel() {
		return cuartel;
	}

	public void setEn_cuartel(Esta_en cuartel) {
		this.cuartel = cuartel;
	}
	
}