package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Billetes_jugador
{
    protected AgentIdentifier jugador;
	protected int billetes;
	
	public Billetes_jugador() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public int getBilletes()
	{
		return billetes;
	}
	public void setBilletes(int b)
	{
		this.billetes=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}
