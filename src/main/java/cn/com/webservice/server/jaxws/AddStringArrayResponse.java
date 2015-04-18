
package cn.com.webservice.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addStringArrayResponse", namespace = "http://server.webservice.com.cn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addStringArrayResponse", namespace = "http://server.webservice.com.cn/")
public class AddStringArrayResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private String[] _return;

    /**
     * 
     * @return
     *     returns String[]
     */
    public String[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String[] _return) {
        this._return = _return;
    }

}
