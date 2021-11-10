package tablero.planes;

import jadex.util.SUtil;
import tablero.creencias.*;
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

public class Descartar_billetes_plan extends Plan
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
		AgentIdentifier jugador = result[new Random().nextInt(result.length)].getName();			

		Descartar_billetes db= new Descartar_billetes();
		System.out.println("tablero le dice al jugador si quiere descartar billetes");
		IMessageEvent	msg	= createMessageEvent("requestDescartarBilletes");
		msg.setContent(db);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);

		Billetes_descartados bd = new Billetes_descartados();
		IMessageEvent	msg	= createMessageEvent("informBilletesDescartados");
		msg.setContent(bd);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);

		IMessageEvent	msg	= createMessageEvent("informBilletesDescartados");
		msg.setContent(bd);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
    }
}