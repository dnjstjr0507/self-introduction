package com.springboot.selfintroduction.dto.mail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MailSendDto {
    private String name;
    private String email;
    private String message;
}
