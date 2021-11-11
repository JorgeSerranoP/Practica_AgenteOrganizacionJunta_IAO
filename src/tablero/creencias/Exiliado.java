package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Exiliado
{
    protected AgentIdentifier jugador;
	protected boolean exiliado;
	
	public Exiliado() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public boolean getExiliado()
	{
		return exiliado;
	}
	public void setExiliado(boolean b)
	{
		this.exiliado=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}
