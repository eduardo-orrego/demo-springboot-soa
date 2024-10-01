
package org.xuaxpedia.springboot.soa.rest.simplesoapclient.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataXml" type="{http://www.xuaxpedia.org/springboot/soa/soap/simplesoapyml/xml}DataXml"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataXml"
})
@XmlRootElement(name = "DataXmlResponse")
public class DataXmlResponse {

    @XmlElement(name = "DataXml", required = true)
    protected DataXml dataXml;

    /**
     * Obtiene el valor de la propiedad dataXml.
     * 
     * @return
     *     possible object is
     *     {@link DataXml }
     *     
     */
    public DataXml getDataXml() {
        return dataXml;
    }

    /**
     * Define el valor de la propiedad dataXml.
     * 
     * @param value
     *     allowed object is
     *     {@link DataXml }
     *     
     */
    public void setDataXml(DataXml value) {
        this.dataXml = value;
    }

}
