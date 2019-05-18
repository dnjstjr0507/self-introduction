package com.springboot.selfintroduction.service;

import com.springboot.selfintroduction.dto.mail.MailSendDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MaileServiceImpl {

    private JavaMailSender mailSender;

    public void sendSimpleMessage(MailSendDto dto)throws MailException{
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(dto.getEmail());
        message.setTo("dnjstjr0507@naver.com");
        message.setSubject("※ 포트폴리오 홈페이지 메일: " +dto.getName() + " ※");
        message.setText(dto.getMessage());
        mailSender.send(message);
    }
}
