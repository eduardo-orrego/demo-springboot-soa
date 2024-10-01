
package org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataXmlRequest }
     * 
     */
    public GetDataXmlRequest createGetDataXmlRequest() {
        return new GetDataXmlRequest();
    }

    /**
     * Create an instance of {@link CreateDataXmlRequest }
     * 
     */
    public CreateDataXmlRequest createCreateDataXmlRequest() {
        return new CreateDataXmlRequest();
    }

    /**
     * Create an instance of {@link DataXmlResponse }
     * 
     */
    public DataXmlResponse createDataXmlResponse() {
        return new DataXmlResponse();
    }

    /**
     * Create an instance of {@link DataXml }
     * 
     */
    public DataXml createDataXml() {
        return new DataXml();
    }

}
