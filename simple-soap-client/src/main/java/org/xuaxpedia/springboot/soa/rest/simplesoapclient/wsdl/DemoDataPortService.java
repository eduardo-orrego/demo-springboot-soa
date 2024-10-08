
package org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "DemoDataPortService", targetNamespace = "http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml", wsdlLocation = "http://localhost:8084/service/demoDataWsdl.wsdl")
public class DemoDataPortService
    extends Service
{

    private final static URL DEMODATAPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEMODATAPORTSERVICE_EXCEPTION;
    private final static QName DEMODATAPORTSERVICE_QNAME = new QName("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml", "DemoDataPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/service/demoDataWsdl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEMODATAPORTSERVICE_WSDL_LOCATION = url;
        DEMODATAPORTSERVICE_EXCEPTION = e;
    }

    public DemoDataPortService() {
        super(__getWsdlLocation(), DEMODATAPORTSERVICE_QNAME);
    }

    public DemoDataPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEMODATAPORTSERVICE_QNAME, features);
    }

    public DemoDataPortService(URL wsdlLocation) {
        super(wsdlLocation, DEMODATAPORTSERVICE_QNAME);
    }

    public DemoDataPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEMODATAPORTSERVICE_QNAME, features);
    }

    public DemoDataPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DemoDataPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DemoDataPort
     */
    @WebEndpoint(name = "DemoDataPortSoap11")
    public DemoDataPort getDemoDataPortSoap11() {
        return super.getPort(new QName("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml", "DemoDataPortSoap11"), DemoDataPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DemoDataPort
     */
    @WebEndpoint(name = "DemoDataPortSoap11")
    public DemoDataPort getDemoDataPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml", "DemoDataPortSoap11"), DemoDataPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEMODATAPORTSERVICE_EXCEPTION!= null) {
            throw DEMODATAPORTSERVICE_EXCEPTION;
        }
        return DEMODATAPORTSERVICE_WSDL_LOCATION;
    }

}
