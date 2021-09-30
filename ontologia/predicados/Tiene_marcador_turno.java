package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Tiene_marcador_turno implements Predicado {
    
	private Tablero tablero;
	private Marcador_turno marcador_turno;
	
	public Tiene_marcador_turno()
	{ ; }

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Marcador_turno getMarcador_turno() {
		return marcador_turno;
	}

	public void setMarcador_turno(Marcador_turno marcador_turno) {
		this.marcador_turno = marcador_turno;
	}
	
}