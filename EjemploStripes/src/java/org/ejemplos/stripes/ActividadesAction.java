package org.ejemplos.stripes;

import java.util.List;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import org.ejemplos.modelo.Actividad;
import org.ejemplos.oad.ActividadOad;

/**
 *
 * @author JAguilar
 */
public class ActividadesAction extends AccionBase{
    private List<Actividad> actividades;

    public List<Actividad> getActividades() {
        return actividades;
    }

    public Resolution listarActividades() {
        actividades = ActividadOad.getActividades();
        return new ForwardResolution("/actividades/lista.jsp");
    }
}
