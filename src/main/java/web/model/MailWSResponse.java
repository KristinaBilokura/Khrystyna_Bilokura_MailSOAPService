package web.model;

import model.Mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;

@XmlAccessorType(XmlAccessType.FIELD)
public class MailWSResponse {

    @XmlElementRef(type = Mail.class)
    private Object result;

    @XmlElementRef(type = Mail.class)
    private Object[] results;

    @XmlElementRefs({@XmlElementRef(type = MailWSStatusSuccess.class), @XmlElementRef(type = MailWSStatusFault.class)})
    private MailWSStatus status;

    public MailWSResponse() {}


    private MailWSResponse(MailWSStatus status,Object result) {
        this.result = result;
        this.status = status;
    }
    private MailWSResponse(MailWSStatus status, Object[] results) {
        this.results = results;
        this.status = status;
    }
    private MailWSResponse(MailWSStatus status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static MailWSResponse success(String status,Object result){
        return new MailWSResponse(new MailWSStatusSuccess(status), result);
    }

    public static MailWSResponse success(String status,Object[] results){
        return new MailWSResponse(new MailWSStatusSuccess(status), results);
    }

    public static MailWSResponse fault(String status){
        return new MailWSResponse(new MailWSStatusFault(status));
    }


}
