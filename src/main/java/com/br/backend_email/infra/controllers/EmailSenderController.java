package com.br.backend_email.infra.controllers;

import com.br.backend_email.application.EmailSenderService;
import com.br.backend_email.core.EmailRequest;
import com.br.backend_email.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody @Validated EmailRequest emailRequest) {
        try {
            this.emailSenderService.sendEmail(emailRequest.to(), emailRequest.subject(), emailRequest.body());
            return ResponseEntity.ok("Email sent successfully!");
        } catch (EmailServiceException exc) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email sending failed!");
        }
    }
}
