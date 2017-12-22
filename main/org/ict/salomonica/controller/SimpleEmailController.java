package org.ict.salomonica.controller;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.ict.salomonica.GlobalConstants;
import org.ict.salomonica.service.MailContentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleEmailController {
    
    @Autowired
    private JavaMailSender sender;
    
    @Autowired
    private MailContentBuilder mailContentBuilder;

    @RequestMapping("/simpleemail")
    @ResponseBody
    String home() {
        try {
            sendEmail();
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }

    private void sendEmail() throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        Map<String,String> vars = new HashMap<>();
        vars.put("name","Gabriel");
        vars.put("message","How are you?");
        
        
        helper.setTo("gabriel.sol@gmail.com");
        helper.setText(mailContentBuilder.build(GlobalConstants.EMAIL_TEMPLATE_FILL_5x7, vars), true);
        helper.setSubject("Hi");
        
        sender.send(message);
    }
}