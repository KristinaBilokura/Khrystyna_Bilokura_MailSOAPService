package web.service;

import model.Mail;
import web.model.MailWSResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MailService {

    @WebMethod()
    MailWSResponse getAllMails();

    @WebMethod()
    MailWSResponse getMailByEmail(
            @WebParam(partName ="email") String email);

    @WebMethod()
    MailWSResponse getMailById(
            @WebParam(partName ="id") Integer id);

    @WebMethod()
    MailWSResponse getMailBySubject(
            @WebParam(partName ="subject") String subject);

    @WebMethod()
    MailWSResponse deleteMail(
            @WebParam(partName ="id") Integer id);

    @WebMethod()
    MailWSResponse addMail(@WebParam(partName ="addMail") Mail mail);





}
