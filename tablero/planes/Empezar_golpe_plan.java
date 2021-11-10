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

public class Empezar_golpe_plan extends Plan
{

    public void body()
    {
		IMessageEvent	queryif	= (IMessageEvent)getInitialEvent();
		AgentIdentifier jugador= (AgentIdentifier) queryif.getParameter("sender").getValue();
	
        Excusa_activada ea= new Excusa_activada();
        excusa_activada = getBeliefbase().getBelief("excusa_activada").getFact();

		if (excusa_activada==false)
		{
			msg = createMessageEvent("refuseExcusaActivada");
			System.out.println("la ficha de excusa no esta activada");
		}
        else {
            IMessageEvent	msg	= createMessageEvent("agreeExcusaActivada");
            Empezar_golpe eg = new Empezar_golpe();
            IMessageEvent	msg	= createMessageEvent("requestEmpezarGolpe");
            msg.setContent(eg);
            msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
            sendMessage(msg);
        }
		msg.setContent(ea);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(nevera);
		sendMessage(msg);
	
	}
    }
}