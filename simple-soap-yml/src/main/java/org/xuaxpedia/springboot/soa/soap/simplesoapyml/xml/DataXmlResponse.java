package org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataXml"
})
@XmlRootElement(name = "DataXmlResponse")
public class DataXmlResponse {

    @XmlElement(name = "DataXml")
    protected DataXml dataXml;

    public DataXml getDataXml() {
        return dataXml;
    }

    public void setDataXml(DataXml value) {
        this.dataXml = value;
    }

}
