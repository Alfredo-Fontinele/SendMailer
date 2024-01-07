//package com.br.backend_email.infra.config.aws;
//
//import com.amazonaws.AmazonServiceException;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
//import com.amazonaws.services.simpleemail.model.*;
//import com.br.backend_email.adapters.EmailSenderGateway;
//import com.br.backend_email.core.exceptions.EmailServiceException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailSenderSES implements EmailSenderGateway {
//    @Autowired
//    private final AmazonSimpleEmailService emailService;
//
//    public EmailSenderSES(AmazonSimpleEmailService emailService) {
//        this.emailService = emailService;
//    }
//
//    @Override
//    public void sendEmail(String toEmail, String subject, String body) {
//        SendEmailRequest request = new SendEmailRequest()
//            .withSource("alfredofontinele08@gmail.com")
//            .withDestination(new Destination().withToAddresses(toEmail))
//            .withMessage(new Message()
//                    .withSubject(new Content(subject))
//                    .withBody(new Body().withText(new Content(body)))
//            );
//
//        try {
//            emailService.sendEmail(request);
//        } catch (AmazonServiceException ex) {
//            throw new EmailServiceException("Email sending failed | AWS", ex);
//        }
//    }
//}
