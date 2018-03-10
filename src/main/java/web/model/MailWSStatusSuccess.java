package web.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="success")
public class MailWSStatusSuccess extends MailWSStatus{

    private String message;

    public MailWSStatusSuccess() {
    }

    public MailWSStatusSuccess(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
