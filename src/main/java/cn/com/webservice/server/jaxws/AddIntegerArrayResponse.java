
package cn.com.webservice.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addIntegerArrayResponse", namespace = "http://server.webservice.com.cn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIntegerArrayResponse", namespace = "http://server.webservice.com.cn/")
public class AddIntegerArrayResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private Integer[] _return;

    /**
     * 
     * @return
     *     returns Integer[]
     */
    public Integer[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Integer[] _return) {
        this._return = _return;
    }

}
