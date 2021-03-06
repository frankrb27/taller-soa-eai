
package co.com.ws.alert_on_air;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlertOnAirEndpoint", targetNamespace = "http://alert-on-air.ws.com.co")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlertOnAirEndpoint {


    /**
     * 
     * @param in
     * @return
     *     returns co.com.ws.alert_on_air.AlertOnAirResponse
     */
    @WebMethod(action = "http://alert-on-air.ws.com.co")
    @WebResult(name = "alertOnAirResponse", targetNamespace = "http://alert-on-air.ws.com.co", partName = "out")
    public AlertOnAirResponse create(
        @WebParam(name = "alertOnAirRequest", targetNamespace = "http://alert-on-air.ws.com.co", partName = "in")
        AlertOnAirRequest in);

}
