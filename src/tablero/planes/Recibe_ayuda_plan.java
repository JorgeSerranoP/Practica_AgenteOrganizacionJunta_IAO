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

public class Recibe_ayuda_plan extends Plan
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

		Recibe_ayuda ra= new Recibe_ayuda();
		System.out.println("tablero le dice al presidente si quiere recibir la ayuda extranjera");
		IMessageEvent	msg1	= createMessageEvent("requestRecibeAyuda");
		msg1.setContent(ra);
		msg1.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg1);

		System.out.println("el presidente acepta recibir la ayuda extranjera");
		IMessageEvent	msg2	= createMessageEvent("agreeRecibeAyuda");
		msg2.setContent(ra);
		msg2.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
		sendMessage(msg2);

        Ayuda_recibida ar = new Ayuda_recibida();
		IMessageEvent	msg3	= createMessageEvent("informAyudaRecibida");
		msg3.setContent(ar);
		msg3.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg3);
    }
}