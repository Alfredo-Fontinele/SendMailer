package com.br.backend_email.core;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;


public record EmailRequest(@NotBlank @NotNull @Email String to, @NotBlank @NotNull String subject,
                           @NotBlank @NotNull String body) {
}
