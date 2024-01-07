package com.br.backend_email.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}