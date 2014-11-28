
package acc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the acc package. 
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

    private final static QName _Person_QNAME = new QName("acc", "person");
    private final static QName _GetRfc_QNAME = new QName("acc", "get_rfc");
    private final static QName _GetRfcResponse_QNAME = new QName("acc", "get_rfcResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: acc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRfc }
     * 
     */
    public GetRfc createGetRfc() {
        return new GetRfc();
    }

    /**
     * Create an instance of {@link GetRfcResponse }
     * 
     */
    public GetRfcResponse createGetRfcResponse() {
        return new GetRfcResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "acc", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRfc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "acc", name = "get_rfc")
    public JAXBElement<GetRfc> createGetRfc(GetRfc value) {
        return new JAXBElement<GetRfc>(_GetRfc_QNAME, GetRfc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRfcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "acc", name = "get_rfcResponse")
    public JAXBElement<GetRfcResponse> createGetRfcResponse(GetRfcResponse value) {
        return new JAXBElement<GetRfcResponse>(_GetRfcResponse_QNAME, GetRfcResponse.class, null, value);
    }

}
