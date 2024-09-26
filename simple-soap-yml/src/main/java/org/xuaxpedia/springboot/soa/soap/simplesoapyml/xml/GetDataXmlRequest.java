package org.xuaxpedia.springboot.soa.soap.simplesoapyml.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "GetDataXmlRequest")
public class GetDataXmlRequest {

    @XmlElement(name = "Code")
    protected long code;

    public long getCode() {
        return code;
    }

    public void setCode(long value) {
        this.code = value;
    }

}
