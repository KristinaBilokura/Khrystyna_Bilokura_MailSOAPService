package web.service.impl;
import dao.MailDAO;
import model.Mail;
import web.model.MailWSResponse;
import web.model.MailWSStatus;
import web.service.MailService;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "web.service.MailService")
public class MailServiceImpl implements MailService{

    private MailDAO dao = new MailDAO();

    @Override
    public MailWSResponse getAllMails() {
        Object[] results =  dao.getAll().toArray();
        if(results.length != 0){
            return MailWSResponse.success(MailWSStatus.GET_ALL_MAILS,results);
        }
        return  MailWSResponse.fault(MailWSStatus.NO_MAILS);
    }

    @Override
    public MailWSResponse getMailByEmail(String email) {
        Object[] result = dao.getAllByEmail(email).toArray();

        if(result.length != 0){
            return  MailWSResponse.success(MailWSStatus.GET_MAIL_BY_EMAIL, result);
        }
        return  MailWSResponse.fault(MailWSStatus.NO_SUCH_EMAIL);
    }


    @Override
    public MailWSResponse getMailBySubject(String subject) {
        Object[] results = dao.getAllBySubject(subject).toArray();
        if(results.length != 0){
            return MailWSResponse.success(MailWSStatus.GET_MAILS_BY_SUBJECT,results);
        }
        return  MailWSResponse.fault(MailWSStatus.NO_SUCH_SUBJECT);
    }


    @Override
    public MailWSResponse getMailById(Integer id) {
        Mail result = dao.get(id);
        if(result != null){
            return  MailWSResponse.success(MailWSStatus.GET_MAIL_BY_ID, result);
        }
        return  MailWSResponse.fault(MailWSStatus.NO_SUCH_MAIL);
    }

    @Override
    public MailWSResponse deleteMail(Integer id) {
        boolean result = dao.delete(id);
        if(result){
            return  MailWSResponse.success(MailWSStatus.DELETE_MAIL, null);
        }
        return  MailWSResponse.fault(MailWSStatus.NO_SUCH_MAIL);
    }

    @Override
    public MailWSResponse addMail(Mail mail) {
        if(mail != null && isValidBook(mail)){
            if (!dao.contains(mail)) {
                dao.add(mail);
                return MailWSResponse.success(MailWSStatus.ADD_NEW_MAIL, mail);
            }else{
                return MailWSResponse.fault(MailWSStatus.THIS_MAIL_EXISTS_ALREADY);
            }
        }
        return MailWSResponse.fault(MailWSStatus.NOT_CORRECT_ARGUMENTS);
    }

    private boolean isValidBook(Mail mail){
        if(mail != null &&
                mail.getId()!= null &&
                mail.getId() > 0 &&
                !mail.getEmail().isEmpty()&&
                !mail.getSubject().isEmpty()&&
                !mail.getBody().isEmpty()){
            return true;
        }
        return false;
    }


}
