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
        // busco el jugador (reciever)
		ServiceDescription sd = new ServiceDescription();
		sd.setType("jugador");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		dispatchSubgoalAndWait(ft);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier jugador = result[new Random().nextInt(result.length)].getName();

		// le preguntamos si tiene mas de 6 cartas
		System.out.println("mazo de cartas preguntando si tiene mas de 6 cartas politicas...");
		IMessageEvent	msg	= createMessageEvent("querycartas");
		msg.setContent(cartas > 6);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);

        // informamos que se ha descartado de las cartas
        Cartas_descartadas cd = new Cartas_descartadas();
        IMessageEvent	msg	= createMessageEvent("informdescartadas");
		msg.setContent(cd);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
    }
}
