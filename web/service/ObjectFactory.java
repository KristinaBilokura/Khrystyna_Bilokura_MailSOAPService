
package web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service package. 
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

    private final static QName _Fault_QNAME = new QName("http://service.web/", "fault");
    private final static QName _Message_QNAME = new QName("http://service.web/", "message");
    private final static QName _Success_QNAME = new QName("http://service.web/", "success");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MailWSStatusFault }
     * 
     */
    public MailWSStatusFault createMailWSStatusFault() {
        return new MailWSStatusFault();
    }

    /**
     * Create an instance of {@link Mail }
     * 
     */
    public Mail createMail() {
        return new Mail();
    }

    /**
     * Create an instance of {@link MailWSStatusSuccess }
     * 
     */
    public MailWSStatusSuccess createMailWSStatusSuccess() {
        return new MailWSStatusSuccess();
    }

    /**
     * Create an instance of {@link MailWSResponse }
     * 
     */
    public MailWSResponse createMailWSResponse() {
        return new MailWSResponse();
    }

    /**
     * Create an instance of {@link MailWSStatus }
     * 
     */
    public MailWSStatus createMailWSStatus() {
        return new MailWSStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailWSStatusFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailWSStatusFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "fault")
    public JAXBElement<MailWSStatusFault> createFault(MailWSStatusFault value) {
        return new JAXBElement<MailWSStatusFault>(_Fault_QNAME, MailWSStatusFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mail }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "message")
    public JAXBElement<Mail> createMessage(Mail value) {
        return new JAXBElement<Mail>(_Message_QNAME, Mail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailWSStatusSuccess }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailWSStatusSuccess }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "success")
    public JAXBElement<MailWSStatusSuccess> createSuccess(MailWSStatusSuccess value) {
        return new JAXBElement<MailWSStatusSuccess>(_Success_QNAME, MailWSStatusSuccess.class, null, value);
    }

}
