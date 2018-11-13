package clima.model;

import clima.model.entities.Clima;
import javax.ejb.Stateless;

/**
 *
 * @author KEV
 */
@Stateless
public class ModelClima {

    public Clima consultarClima(){
        Clima c = new Clima();
        c.setHumedad(23.4f);
        c.setTemperatura(19);
        return c;
    }
}
