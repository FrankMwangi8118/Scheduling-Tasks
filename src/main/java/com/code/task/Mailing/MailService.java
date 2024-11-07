package com.code.task.Mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMails() {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("frankmwangi8118@gmail.com");
        message.setTo("thetechguy499@gmail.com");
        message.setSubject("mailing");
        message.setText("yooh");
        javaMailSender.send(message);
    }
}
