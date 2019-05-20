package com.springboot.selfintroduction.service;

import com.springboot.selfintroduction.dto.mail.MailSendDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 20.
 * Github : http://github.com/dnjstjr0507
 */


@AllArgsConstructor
@Service
public class MaileServiceImpl {

    private JavaMailSender mailSender;

    public int sendSimpleMessage(MailSendDto dto)throws MailException{
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("dnjstjr0507@naver.com");
        message.setSubject("※ 포트폴리오 홈페이지 메일: " +dto.getName() + " ※");
        message.setText("보내는 이 : " + dto.getEmail() + "내용 : " + dto.getMessage());
        try{
            mailSender.send(message);
            return 1;
        }catch (MailException mailException){
            System.out.println("MailServiceImpl error :" + mailException);
            return 0;
        }
    }
}
