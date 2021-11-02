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
import ontologia.predicados.Cartas_descartadas;

public class Descartar_cartas_plan extends Plan
{
    private int buscar (Cartas_politicas_jugador[] cartas, AgentIdentifier jugador)
	{
		int retorno=-1;
		int i= cartas.length;
		boolean encontrado=false;
		while ((i>0) && !encontrado)
		{
			i--;
			Cartas_politicas_jugador bphi= cartas[i];
			AgentIdentifier hi= bphi.getHuman();
			if (hi.equals(jugador))
			{
				encontrado=true;
				retorno= bphi.getCartas();
			}
		}
		return retorno;
	}

    public void body()
    {
		// miro cuantas cartas tiene ese jugador
		IMessageEvent	queryif	= (IMessageEvent)getInitialEvent();
		AgentIdentifier jugador = (AgentIdentifier) queryif.getParameter("sender").getValue();
		Cartas_politicas_jugador[] cartas= (Cartas_politicas_jugador[]) getBeliefbase().getBeliefSet("cartas").getFacts();
			
		System.out.println ("jugador registra la carta del jugador...");
		Cartas_politicas_jugador cpj= new Cartas_politicas_jugador();
		cpj.setJugador(jugador);
		cpj.setCartas(7);
		getBeliefbase().getBeliefSet("cartas").addFact(cpj);

		// le preguntamos si tiene mas de 6 cartas
		System.out.println("mazo de cartas preguntando si tiene mas de 6 cartas politicas...");
		IMessageEvent	msg	= createMessageEvent("querycartas");
		msg.setContent(cartas > 6);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
		if (cpj.getCartas()>6)
		{
			msg = createMessageEvent("confirmdescartar");
			System.out.println("jugador confirma que tiene mas de 6 cartas");
			 // informamos que se ha descartado de las cartas
			 Cartas_descartadas cd = new Cartas_descartadas();
			 IMessageEvent	msg	= createMessageEvent("informdescartadas");
			 msg.setContent(cd);
			 msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
			 sendMessage(msg);
			 cpj.setJugador(jugador);
			 cpj.setCartas(6);
		}
		else 
		{	
			IMessageEvent	msg	= createMessageEvent("disconfirmdescartar");
		}   
    }
}
