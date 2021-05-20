
package com.samaspace.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.samaspace.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConversionDollarToDHSResponse_QNAME = new QName("http://service.samaspace.com/", "conversionDollarToDHSResponse");
    private final static QName _GetAllAccounts_QNAME = new QName("http://service.samaspace.com/", "getAllAccounts");
    private final static QName _TakeOneAccountResponse_QNAME = new QName("http://service.samaspace.com/", "takeOneAccountResponse");
    private final static QName _Compte_QNAME = new QName("http://service.samaspace.com/", "compte");
    private final static QName _TakeOneAccount_QNAME = new QName("http://service.samaspace.com/", "takeOneAccount");
    private final static QName _GetAllAccountsResponse_QNAME = new QName("http://service.samaspace.com/", "getAllAccountsResponse");
    private final static QName _ConversionDollarToDHS_QNAME = new QName("http://service.samaspace.com/", "conversionDollarToDHS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.samaspace.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link TakeOneAccountResponse }
     * 
     */
    public TakeOneAccountResponse createTakeOneAccountResponse() {
        return new TakeOneAccountResponse();
    }

    /**
     * Create an instance of {@link ConversionDollarToDHSResponse }
     * 
     */
    public ConversionDollarToDHSResponse createConversionDollarToDHSResponse() {
        return new ConversionDollarToDHSResponse();
    }

    /**
     * Create an instance of {@link ConversionDollarToDHS }
     * 
     */
    public ConversionDollarToDHS createConversionDollarToDHS() {
        return new ConversionDollarToDHS();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link TakeOneAccount }
     * 
     */
    public TakeOneAccount createTakeOneAccount() {
        return new TakeOneAccount();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDollarToDHSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "conversionDollarToDHSResponse")
    public JAXBElement<ConversionDollarToDHSResponse> createConversionDollarToDHSResponse(ConversionDollarToDHSResponse value) {
        return new JAXBElement<ConversionDollarToDHSResponse>(_ConversionDollarToDHSResponse_QNAME, ConversionDollarToDHSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<GetAllAccounts>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeOneAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "takeOneAccountResponse")
    public JAXBElement<TakeOneAccountResponse> createTakeOneAccountResponse(TakeOneAccountResponse value) {
        return new JAXBElement<TakeOneAccountResponse>(_TakeOneAccountResponse_QNAME, TakeOneAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeOneAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "takeOneAccount")
    public JAXBElement<TakeOneAccount> createTakeOneAccount(TakeOneAccount value) {
        return new JAXBElement<TakeOneAccount>(_TakeOneAccount_QNAME, TakeOneAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<GetAllAccountsResponse>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDollarToDHS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.samaspace.com/", name = "conversionDollarToDHS")
    public JAXBElement<ConversionDollarToDHS> createConversionDollarToDHS(ConversionDollarToDHS value) {
        return new JAXBElement<ConversionDollarToDHS>(_ConversionDollarToDHS_QNAME, ConversionDollarToDHS.class, null, value);
    }

}
