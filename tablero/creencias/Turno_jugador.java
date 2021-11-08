package tablero.creencias;

import javax.swing.text.StyledEditorKit.BoldAction;

import jadex.adapter.fipa.AgentIdentifier;

public class TieneMasDe6Cartas
{
    protected AgentIdentifier jugador;
	protected Boolean turno_jugador;
	
	public Turno_jugador() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public boolean getTurnoJugador()
	{
		return turno_jugador;
	}
	public void setTieneMasDe6Cartas(boolean b)
	{
		this.turno_jugador=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}
