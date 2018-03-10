package web.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="fault")
public class MailWSStatusFault extends MailWSStatus {

    private String message;

    public MailWSStatusFault() {}

    public MailWSStatusFault(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}