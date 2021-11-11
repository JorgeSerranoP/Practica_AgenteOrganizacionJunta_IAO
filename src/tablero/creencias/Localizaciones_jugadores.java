package tablero.creencias;

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
	public String getLocalizacion()
	{
		return localizacion;
	}
	public void setLocalizacion(String b)
	{
		this.localizacion=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}