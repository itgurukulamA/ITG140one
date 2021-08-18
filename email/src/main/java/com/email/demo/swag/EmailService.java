package com.email.demo.swag;

import java.io.File;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ws.mime.MimeMessage;
@Service
public class EmailService {
	@Autowired
    private JavaMailSender emailSender;
public String sendMail(Email email) {
	SimpleMailMessage message = new SimpleMailMessage(); 
  
    message.setTo(email.getTo()); 
    message.setSubject(email.getSubject()); 
    message.setText(email.getEmessage());
    try {
    	emailSender.send(message);
    }catch(Exception e){
    	return "smting went wrong";
    }
    
	return "success";
}
public String sendMailAttachachment(Email email) throws MessagingException {
	 javax.mail.internet.MimeMessage message = emailSender.createMimeMessage();
     
	    MimeMessageHelper helper = new MimeMessageHelper((javax.mail.internet.MimeMessage) message, true);
	    
	    helper.setTo(email.getTo());
	    helper.setSubject(email.getSubject());
	    helper.setText(email.getEmessage());
	        
	    FileSystemResource file 
	      = new FileSystemResource(new File("D:\\Workspace\\springboot\\email\\src\\main\\java\\com\\email\\demo\\test.txt"));
	    helper.addAttachment(email.getAttachname(), file);
	    try {
	    	emailSender.send(message);
	    }catch(Exception e){
	    	return "smting went wrong";
	    }
	    
		return "success";
}
}