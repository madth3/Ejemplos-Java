package org.ejemplos.control;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author JAguilar
 */
public class AccionInicio extends AccionBase {
    
    public Resolution mostrarInicio() {
        return new ForwardResolution("/index.jsp");
    }
}
