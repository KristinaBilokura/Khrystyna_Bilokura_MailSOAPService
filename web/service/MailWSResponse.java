
package web.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailWSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailWSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://service.web/}message"/&gt;
 *         &lt;element ref="{http://service.web/}message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://service.web/}success"/&gt;
 *           &lt;element ref="{http://service.web/}fault"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailWSResponse", propOrder = {
    "content"
})
public class MailWSResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "message", namespace = "http://service.web/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "success", namespace = "http://service.web/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fault", namespace = "http://service.web/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     *         
     *         <p>
     *         You are getting this "catch-all" property because of the following reason: 
     *         The field name "Message" is used by two different parts of a schema. See: 
     *         line 12 of http://localhost:8080/MailService?xsd=1
     *         line 11 of http://localhost:8080/MailService?xsd=1
     *         <p>
     *         To get rid of this property, apply a property customization to one 
     *         of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Mail }{@code >}
     * {@link JAXBElement }{@code <}{@link MailWSStatusSuccess }{@code >}
     * {@link JAXBElement }{@code <}{@link MailWSStatusFault }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
