
package cn.com.webservice.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addIntegerArray", namespace = "http://server.webservice.com.cn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIntegerArray", namespace = "http://server.webservice.com.cn/", propOrder = {
    "arg0",
    "arg1"
})
public class AddIntegerArray {

    @XmlElement(name = "arg0", namespace = "", nillable = true)
    private Integer[] arg0;
    @XmlElement(name = "arg1", namespace = "", nillable = true)
    private Integer[] arg1;

    /**
     * 
     * @return
     *     returns Integer[]
     */
    public Integer[] getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Integer[] arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns Integer[]
     */
    public Integer[] getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(Integer[] arg1) {
        this.arg1 = arg1;
    }

}
