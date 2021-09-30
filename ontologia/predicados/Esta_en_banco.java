package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.*;

public class Esta_en_banco implements Predicado {
    
	private Banco banco;
	private Jugador jugador;
	
	public Esta_en_banco()
	{ ; }

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}