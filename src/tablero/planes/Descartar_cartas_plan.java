package src.tablero.planes;

import jadex.util.SUtil;
import src.ontologia.acciones.*;
import src.ontologia.predicados.Cartas_descartadas;
import src.tablero.creencias.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;

public class Descartar_cartas_plan extends Plan
{

    public void body()
    {
		ServiceDescription sd = new ServiceDescription();
		sd.setType("tablero");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier tablero = result[0].getName();

		TieneMasDe6Cartas tmdc= new TieneMasDe6Cartas();
		System.out.println("tablero le pregunta al jugador si tiene mas de 6 cartas");
		IMessageEvent	msg	= createMessageEvent("queryTieneMasDe6Cartas");
		msg.setContent(tmdc);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);

		NumeroCartas = getBeliefBase().getBelief("Cartas_politicas_jugador").getFact(cartas_politicas);
		if (NumeroCartas > 6){
			IMessageEvent	msg	= createMessageEvent("agreeTieneMasDe6Cartas");
			msg.setContent(tmdc);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg);

			Cartas_descartadas cd = new Cartas_descartadas();
			IMessageEvent	msg	= createMessageEvent("informCartasDescartadas");
			msg.setContent(cd);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador); //BUSCAR JUGADORES CREENCIAS
			sendMessage(msg);
		}

		else {
			IMessageEvent	msg	= createMessageEvent("refuseTieneMasDe6Cartas");
			msg.setContent(tmdc);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg);

			Descartar_cartas dc = new Descartar_cartas();
			IMessageEvent	msg	= createMessageEvent("requestDescartarCartas");
			msg.setContent(dc);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
			sendMessage(msg);

			IMessageEvent	msg	= createMessageEvent("agreeDescartarCartas");
			msg.setContent(dc);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg);
			
			IMessageEvent	msg	= createMessageEvent("refuseDescartarCartas");
			msg.setContent(dc);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg);
		}
    }
}
