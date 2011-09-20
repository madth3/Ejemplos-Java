package org.ejemplos.stripes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import org.ejemplos.modelo.Actividad;
import org.ejemplos.modelo.Categoria;
import org.ejemplos.oad.ActividadOad;
import org.ejemplos.oad.CategoriaOad;

/**
 *
 * @author JAguilar
 */
public class ActividadesAction extends AccionBase{
    
    private ActividadOad actOad = new ActividadOad();
    private CategoriaOad catOad = new CategoriaOad();
    
    private List<Actividad> actividades;
    private Map<Long, Categoria> categorias;

    public List<Actividad> getActividades() {
        return actividades;
    }
    
    public Map<Long,Categoria> getMapaCategorias() {
        return categorias;
    }

    public Resolution listarActividades() {
        actividades = actOad.getActividades();
        categorias = new HashMap<Long, Categoria>();
        for (Categoria cat: catOad.getCategorias()) {
            // Se convierte los id's a Long por un problema con las etiquetas usadas en los JSP
            categorias.put(new Long(cat.getId()), cat);
        }
        return new ForwardResolution("/actividades/lista.jsp");
    }
}
