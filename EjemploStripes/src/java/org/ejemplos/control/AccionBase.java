package org.ejemplos.control;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Clase que sera la base de las demas acciones
 * @author JAguilar
 */
public class AccionBase implements ActionBean {

    protected ActionBeanContext contexto;
    
    @Override
    public void setContext(ActionBeanContext abc) {
        contexto = abc;
    }

    @Override
    public ActionBeanContext getContext() {
        return contexto;
    }
    
}
