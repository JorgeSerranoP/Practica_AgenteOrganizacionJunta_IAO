package ontologia.conceptos;

import ontologia.Concepto;
import ontologia.Predicado;
import ontologia.predicados.*;

public class Cuenta_suiza implements Concepto {
	
	private Esta_en_banco estar_banco;
	private Billetes cantidad;
	
	public Cuenta_suiza()
	{ ; }

	public Esta_en_banco isEstar_banco() {
		return estar_banco;
	}

	public void setEstar_banco(Esta_en_banco estar_banco) {
		this.estar_banco = estar_banco;
	}

	public Billetes getCantidad() {
		return cantidad;
	}

	public void setCantidad(Billetes cantidad) {
		this.cantidad = cantidad;
	}
	
}