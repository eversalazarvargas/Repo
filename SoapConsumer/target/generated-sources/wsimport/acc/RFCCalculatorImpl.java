
package acc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RFCCalculatorImpl", targetNamespace = "acc")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RFCCalculatorImpl {


    /**
     * 
     * @param personParam
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_rfc")
    @WebResult(name = "rfc", targetNamespace = "")
    @RequestWrapper(localName = "get_rfc", targetNamespace = "acc", className = "acc.GetRfc")
    @ResponseWrapper(localName = "get_rfcResponse", targetNamespace = "acc", className = "acc.GetRfcResponse")
    public String getRfc(
        @WebParam(name = "person_param", targetNamespace = "")
        Person personParam);

}
