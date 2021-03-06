
package com.samaspace.service;

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
@WebServiceClient(name = "ServiceBankService", targetNamespace = "http://service.samaspace.com/", wsdlLocation = "http://localhost:8080/Tp-JWS/ws/hs?wsdl")
public class ServiceBankService
    extends Service
{

    private final static URL SERVICEBANKSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEBANKSERVICE_EXCEPTION;
    private final static QName SERVICEBANKSERVICE_QNAME = new QName("http://service.samaspace.com/", "ServiceBankService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Tp-JWS/ws/hs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEBANKSERVICE_WSDL_LOCATION = url;
        SERVICEBANKSERVICE_EXCEPTION = e;
    }

    public ServiceBankService() {
        super(__getWsdlLocation(), SERVICEBANKSERVICE_QNAME);
    }

    public ServiceBankService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEBANKSERVICE_QNAME, features);
    }

    public ServiceBankService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEBANKSERVICE_QNAME);
    }

    public ServiceBankService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEBANKSERVICE_QNAME, features);
    }

    public ServiceBankService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceBankService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceBank
     */
    @WebEndpoint(name = "ServiceBankPort")
    public ServiceBank getServiceBankPort() {
        return super.getPort(new QName("http://service.samaspace.com/", "ServiceBankPort"), ServiceBank.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceBank
     */
    @WebEndpoint(name = "ServiceBankPort")
    public ServiceBank getServiceBankPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.samaspace.com/", "ServiceBankPort"), ServiceBank.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEBANKSERVICE_EXCEPTION!= null) {
            throw SERVICEBANKSERVICE_EXCEPTION;
        }
        return SERVICEBANKSERVICE_WSDL_LOCATION;
    }

}
