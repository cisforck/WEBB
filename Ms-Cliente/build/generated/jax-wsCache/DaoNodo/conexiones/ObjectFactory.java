
package conexiones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the conexiones package. 
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

    private final static QName _RegistrarNodo_QNAME = new QName("http://Conexiones/", "RegistrarNodo");
    private final static QName _HelloResponse_QNAME = new QName("http://Conexiones/", "helloResponse");
    private final static QName _RegistrarNodoResponse_QNAME = new QName("http://Conexiones/", "RegistrarNodoResponse");
    private final static QName _Hello_QNAME = new QName("http://Conexiones/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: conexiones
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarNodo }
     * 
     */
    public RegistrarNodo createRegistrarNodo() {
        return new RegistrarNodo();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegistrarNodoResponse }
     * 
     */
    public RegistrarNodoResponse createRegistrarNodoResponse() {
        return new RegistrarNodoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarNodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conexiones/", name = "RegistrarNodo")
    public JAXBElement<RegistrarNodo> createRegistrarNodo(RegistrarNodo value) {
        return new JAXBElement<RegistrarNodo>(_RegistrarNodo_QNAME, RegistrarNodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conexiones/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarNodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conexiones/", name = "RegistrarNodoResponse")
    public JAXBElement<RegistrarNodoResponse> createRegistrarNodoResponse(RegistrarNodoResponse value) {
        return new JAXBElement<RegistrarNodoResponse>(_RegistrarNodoResponse_QNAME, RegistrarNodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conexiones/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
