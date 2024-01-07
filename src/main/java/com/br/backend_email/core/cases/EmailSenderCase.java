package com.br.backend_email.core.cases;

public interface EmailSenderCase {
    void sendEmail(String toEmail, String subject, String body);
}
