package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Descartar_cartas implements Accion {
	
	private Cartas_pol�ticas carta;
	
    public Descartar_cartas()
    { ; }

	public Cartas_pol�ticas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_pol�ticas carta) {
		this.carta = carta;
	}
    
    
}