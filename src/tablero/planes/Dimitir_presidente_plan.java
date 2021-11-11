package tablero.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
import ontologia.predicados.*;
import tablero.creencias.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;

public class Dimitir_presidente_plan extends Plan
{

    public void body()
    {
		ServiceDescription sdTablero = new ServiceDescription();
		sdTablero.setType("tablero");
		AgentDescription dfadescTablero = new AgentDescription();
		dfadescTablero.addService(sdTablero);
		IGoal ftTablero = createGoal("df_search");
		ftTablero.getParameter("description").setValue(dfadescTablero);
		AgentDescription[]	result	= (AgentDescription[])ftTablero.getParameterSet("result").getValues();
		AgentIdentifier tablero = result[0].getName();

		ServiceDescription sdJugador = new ServiceDescription();
		sdJugador.setType("jugador");
		AgentDescription dfadescJugador = new AgentDescription();
		dfadescJugador.addService(sdJugador);
		IGoal ftJugador = createGoal("df_search");
		ftJugador.getParameter("description").setValue(dfadescJugador);
		AgentDescription[]	result1	= (AgentDescription[])ftJugador.getParameterSet("result").getValues();
		AgentIdentifier jugador = result1[0].getName();

		Dimitir_presidente dp = new Dimitir_presidente();
		System.out.println("tablero le dice al presidente si quiere dimitir");
		IMessageEvent	msg	= createMessageEvent("requestDimitir");
		msg.setContent(dp);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador); //Este jugador es el presidente
		sendMessage(msg);

		Dimitido pd = new Dimitido();
		IMessageEvent	msg1	= createMessageEvent("informDimitido");
		msg1.setContent(pd);
		msg1.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg1);
    }
}
//recorrer array de jugadores para mandar el mensaje