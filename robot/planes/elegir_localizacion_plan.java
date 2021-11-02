package robot.planes;

import jadex.util.SUtil;
import robot.creencias.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import ontologia.acciones.*;

public class Elegir_localizacion_plan extends Plan
{
    public void body()
    {
		// miro cuantas cervezas tiene ese humano
		System.out.println ("localizaciones recibe peticion de elegir_localizacion...");
		IMessageEvent	request	= (IMessageEvent)getInitialEvent();
		AgentIdentifier jugador = (AgentIdentifier) request.getParameter("sender").getValue();
		Localizaciones_jugadores[] localizaciones= (Localizaciones_jugadores[]) getBeliefbase().getBeliefSet("localizaciones_jugadores").getFacts();
			
		System.out.println ("localizaciones registra la localizacion del jugador...");
		Localizaciones_jugadores lj= new Localizaciones_jugadores();
		lj.setJugador(jugador);
		lj.setLocalizacion("Banco");
		getBeliefbase().getBeliefSet("localizaciones_jugadores").addFact(lj);
			
		// mando mensaje de aceptación si puede elegir esa localizacion 
		Elige_localizacion el = new Elige_localizacion();
		IMessageEvent	msg	= createMessageEvent("agreeelige_localizacion");
		msg.setContent(el);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
		System.out.println("localizaciones asigna una localizacion");
	}
}
