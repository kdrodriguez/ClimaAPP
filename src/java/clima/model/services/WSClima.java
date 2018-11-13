/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima.model.services;

import clima.model.ModelClima;
import clima.model.entities.Clima;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author KEV
 */
@WebService(serviceName = "WSClima")
public class WSClima {

    @EJB
    private ModelClima ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "consultarClima")
    public Clima consultarClima() {
        return ejbRef.consultarClima();
    }
    
}
