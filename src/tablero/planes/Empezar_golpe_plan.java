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

public class Empezar_golpe_plan extends Plan
{

    public void body()
    {
		IMessageEvent	queryif	= (IMessageEvent)getInitialEvent();
		AgentIdentifier jugador= (AgentIdentifier) queryif.getParameter("sender").getValue();
	
        Excusa_activada ea= new Excusa_activada();
        ea = (Excusa_activada)getBeliefbase().getBelief("excusa_activada").getFact();

		if (ea.equals(false))
		{
			IMessageEvent msg = createMessageEvent("refuseExcusaActivada");
			System.out.println("la ficha de excusa no esta activada");
            msg.setContent(ea);
		    msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		    sendMessage(msg);
		}
        else {
            IMessageEvent	msg1	= createMessageEvent("agreeExcusaActivada");
            msg1.setContent(ea);
            msg1.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
            sendMessage(msg1);
            IMessageEvent	msg2	= createMessageEvent("requestEmpezarGolpe"); 
            Empezar_golpe eg = new Empezar_golpe();         
            msg2.setContent(eg);
		    msg2.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		    sendMessage(msg2);
        }
	}
}