package com.br.backend_email.application;

import com.br.backend_email.adapters.EmailSenderGateway;
import com.br.backend_email.core.cases.EmailSenderCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    public void sendEmail(String toEmail, String subject, String body) {
        emailSenderGateway.sendEmail(toEmail, subject, body);
    }

}

