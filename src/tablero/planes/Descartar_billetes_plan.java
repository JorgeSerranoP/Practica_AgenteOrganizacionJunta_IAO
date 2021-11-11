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

public class Descartar_billetes_plan extends Plan
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

		Descartar_billetes db= new Descartar_billetes();
		System.out.println("tablero le dice al jugador si quiere descartar billetes");
		IMessageEvent	msg1	= createMessageEvent("requestDescartarBilletes");
		msg1.setContent(db);
		msg1.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg1);

		IMessageEvent	msg2	= createMessageEvent("agreeDescartarBilletes");
		msg2.setContent(db);
		msg2.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
		sendMessage(msg2);

		IMessageEvent	msg3	= createMessageEvent("refuseDescartarBilletes");
		msg3.setContent(db);
		msg3.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
		sendMessage(msg3);

		Billetes_descartados bd = new Billetes_descartados();
		IMessageEvent	msg4	= createMessageEvent("informBilletesDescartados");
		msg4.setContent(bd);
		msg4.getParameterSet(SFipa.RECEIVERS).addValue(jugador); //MIRAR CREENCIAS JUGADOR
		sendMessage(msg4);
    }
}