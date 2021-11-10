package src.tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Localizaciones_jugadores
{
    protected AgentIdentifier jugador;
	protected String localizacion;
	
	public Localizaciones_jugadores() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public int getLocalizacion()
	{
		return localizacion;
	}
	public void setLocalizacion(int b)
	{
		this.localizacion=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}