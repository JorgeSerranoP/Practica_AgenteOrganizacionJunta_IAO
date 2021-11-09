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

public class Dimitir_presidente_plan extends Plan
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

		Dimitir_presidente dp= new Dimitir_presidente();
		System.out.println("tablero le dice al presidente si quiere dimitir");
		IMessageEvent	msg	= createMessageEvent("requestDimitir");
		msg.setContent(dp);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(presidente);
		sendMessage(msg);
		
    }
}