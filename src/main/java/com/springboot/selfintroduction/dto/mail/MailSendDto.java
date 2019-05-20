package com.springboot.selfintroduction.dto.mail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 20.
 * Github : http://github.com/dnjstjr0507
 */


@Getter
@NoArgsConstructor
public class MailSendDto {
    private String name;
    private String email;
    private String message;


}
