package ontologia.acciones;

import ontologia.Accion;
import ontologia.conceptos.*;

public class Descartar_cartas implements Accion {
	
	private Cartas_políticas carta;
	
    public Descartar_cartas()
    { ; }

	public Cartas_políticas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_políticas carta) {
		this.carta = carta;
	}
    
    
}