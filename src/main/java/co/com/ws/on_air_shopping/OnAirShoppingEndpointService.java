
package co.com.ws.on_air_shopping;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OnAirShoppingEndpointService", targetNamespace = "http://on-air-shopping.ws.com.co", wsdlLocation = "file:/opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/wsdl/on-air-shopping.wsdl")
public class OnAirShoppingEndpointService
    extends Service
{

    private final static URL ONAIRSHOPPINGENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ONAIRSHOPPINGENDPOINTSERVICE_EXCEPTION;
    private final static QName ONAIRSHOPPINGENDPOINTSERVICE_QNAME = new QName("http://on-air-shopping.ws.com.co", "OnAirShoppingEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/wsdl/on-air-shopping.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONAIRSHOPPINGENDPOINTSERVICE_WSDL_LOCATION = url;
        ONAIRSHOPPINGENDPOINTSERVICE_EXCEPTION = e;
    }

    public OnAirShoppingEndpointService() {
        super(__getWsdlLocation(), ONAIRSHOPPINGENDPOINTSERVICE_QNAME);
    }

    public OnAirShoppingEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONAIRSHOPPINGENDPOINTSERVICE_QNAME, features);
    }

    public OnAirShoppingEndpointService(URL wsdlLocation) {
        super(wsdlLocation, ONAIRSHOPPINGENDPOINTSERVICE_QNAME);
    }

    public OnAirShoppingEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONAIRSHOPPINGENDPOINTSERVICE_QNAME, features);
    }

    public OnAirShoppingEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OnAirShoppingEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OnAirShoppingEndpoint
     */
    @WebEndpoint(name = "OnAirShoppingEndpoint")
    public OnAirShoppingEndpoint getOnAirShoppingEndpoint() {
        return super.getPort(new QName("http://on-air-shopping.ws.com.co", "OnAirShoppingEndpoint"), OnAirShoppingEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OnAirShoppingEndpoint
     */
    @WebEndpoint(name = "OnAirShoppingEndpoint")
    public OnAirShoppingEndpoint getOnAirShoppingEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://on-air-shopping.ws.com.co", "OnAirShoppingEndpoint"), OnAirShoppingEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONAIRSHOPPINGENDPOINTSERVICE_EXCEPTION!= null) {
            throw ONAIRSHOPPINGENDPOINTSERVICE_EXCEPTION;
        }
        return ONAIRSHOPPINGENDPOINTSERVICE_WSDL_LOCATION;
    }

}
