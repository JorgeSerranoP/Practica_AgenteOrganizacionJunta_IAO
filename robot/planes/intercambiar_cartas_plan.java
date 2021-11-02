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

public class Intercambiar_cartas_plan extends Plan
{
    public void body()
    {
        // busco a la nevera
        ServiceDescription sd = new ServiceDescription();
		sd.setType("fridge");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		dispatchSubgoalAndWait(ft);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		AgentIdentifier nevera = result[new Random().nextInt(result.length)].getName();
    }
}
