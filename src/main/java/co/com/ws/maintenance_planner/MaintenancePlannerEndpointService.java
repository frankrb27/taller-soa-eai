
package co.com.ws.maintenance_planner;

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
@WebServiceClient(name = "MaintenancePlannerEndpointService", targetNamespace = "http://maintenance-planner.ws.com.co")
public class MaintenancePlannerEndpointService
    extends Service
{

    private final static URL MAINTENANCEPLANNERENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException MAINTENANCEPLANNERENDPOINTSERVICE_EXCEPTION;
    private final static QName MAINTENANCEPLANNERENDPOINTSERVICE_QNAME = new QName("http://maintenance-planner.ws.com.co", "MaintenancePlannerEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/wsdl/maintenance-planner.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAINTENANCEPLANNERENDPOINTSERVICE_WSDL_LOCATION = url;
        MAINTENANCEPLANNERENDPOINTSERVICE_EXCEPTION = e;
    }

    public MaintenancePlannerEndpointService() {
        super(__getWsdlLocation(), MAINTENANCEPLANNERENDPOINTSERVICE_QNAME);
    }

    public MaintenancePlannerEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAINTENANCEPLANNERENDPOINTSERVICE_QNAME, features);
    }

    public MaintenancePlannerEndpointService(URL wsdlLocation) {
        super(wsdlLocation, MAINTENANCEPLANNERENDPOINTSERVICE_QNAME);
    }

    public MaintenancePlannerEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAINTENANCEPLANNERENDPOINTSERVICE_QNAME, features);
    }

    public MaintenancePlannerEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MaintenancePlannerEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MaintenancePlannerEndpoint
     */
    @WebEndpoint(name = "MaintenancePlannerEndpoint")
    public MaintenancePlannerEndpoint getMaintenancePlannerEndpoint() {
        return super.getPort(new QName("http://maintenance-planner.ws.com.co", "MaintenancePlannerEndpoint"), MaintenancePlannerEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MaintenancePlannerEndpoint
     */
    @WebEndpoint(name = "MaintenancePlannerEndpoint")
    public MaintenancePlannerEndpoint getMaintenancePlannerEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://maintenance-planner.ws.com.co", "MaintenancePlannerEndpoint"), MaintenancePlannerEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAINTENANCEPLANNERENDPOINTSERVICE_EXCEPTION!= null) {
            throw MAINTENANCEPLANNERENDPOINTSERVICE_EXCEPTION;
        }
        return MAINTENANCEPLANNERENDPOINTSERVICE_WSDL_LOCATION;
    }

}
