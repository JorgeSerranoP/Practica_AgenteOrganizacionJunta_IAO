package tablero.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
import ontologia.predicados.Cartas_descartadas;
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
		ServiceDescription sd = new ServiceDescription();
		sd.setType("presidente");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier presidente = result[0].getName();

        ServiceDescription sd = new ServiceDescription();
		sd.setType("tablero");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier tablero = result[0].getName();

        ServiceDescription sd = new ServiceDescription();
		sd.setType("jugador");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier jugador = result[new Random().nextInt(result.length)].getName();

		Recibe_ayuda ra= new Recibe_ayuda();
		System.out.println("tablero le dice al presidente si quiere recibir la ayuda extranjera");
		IMessageEvent	msg	= createMessageEvent("requestRecibeAyuda");
		msg.setContent(ra);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(presidente);
		sendMessage(msg);

		System.out.println("el presidente acepta recibir la ayuda extranjera");
		IMessageEvent	msg	= createMessageEvent("agreeRecibeAyuda");
		msg.setContent(ra);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
		sendMessage(msg);

        Ayuda_recibida ar = new Ayuda_recibida();
		IMessageEvent	msg	= createMessageEvent("informAyudaRecibida");
		msg.setContent(ar);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
    }
}