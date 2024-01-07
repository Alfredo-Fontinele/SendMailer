package com.br.backend_email.infra.config.spring_boot_mail;

import com.br.backend_email.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SpringBootMail implements EmailSenderGateway {
    private final JavaMailSender javaMailSender;

    @Autowired
    public SpringBootMail(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        javaMailSender.send(message);
    }
}
