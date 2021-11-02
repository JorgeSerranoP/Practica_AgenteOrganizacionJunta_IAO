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

public class Elegir_localizacion_plan extends Plan
{
    public void body()
    {
		System.out.println ("jugador recibe peticion de localizacion...");
		IMessageEvent	request	= (IMessageEvent)getInitialEvent();
		AgentIdentifier localizacion= (AgentIdentifier) request.getParameter("sender").getValue();
		// miro si el jugador esta exiliado
		ServiceDescription sd = new ServiceDescription();
		sd.setType("exiliado");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		dispatchSubgoalAndWait(ft);
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		int i=result.length;
        boolean exiliado=false;
		while ((i>0) && !exiliado)
		{
			i--; 
			AgentIdentifier candidato = result[i].getName();
			exiliado= candidato.equals(localizacion);
		}
		// mando mensaje de aceptación si puede beber 
		Elige_localizacion el = new Elige_localizacion();
		IMessageEvent	msg	= createMessageEvent("agreeeligelocal");
		if (exiliado)
		{
			msg = createMessageEvent("refuseeligelocal");
			System.out.println("jugador deniega peticion localizacion: posible jugador exiliado");
		}
		else // A PARTIR DE AQUI DA ASCO
		{
			// mando mensaje de rechazo si no puede beber mas por ser conductor
			getBeliefbase().getBelief("cervezaspedidas").setFact(new Boolean(true));
			getBeliefbase().getBelief("human").setFact(humano); 
			System.out.println("robot acepta peticion de cerveza");
		}
			msg.setContent(el);
			msg.getParameterSet(SFipa.RECEIVERS).addValue(humano);
			sendMessage(msg);
	}
}
