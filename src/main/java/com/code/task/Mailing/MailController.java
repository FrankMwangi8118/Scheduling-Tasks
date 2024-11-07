package com.code.task.Mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class MailController {
    @Autowired
    private MailService mailService;
    @Scheduled(initialDelay =  10000)
    public void sendMail(){
        mailService.sendMails();
        System.out.println("success");

    }
}
