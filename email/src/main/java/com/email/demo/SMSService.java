package com.email.demo;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.email.demo.swag.Email;

import com.twilio.Twilio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.net.URI;

@Component
public class SMSService {

	final Logger Log = LoggerFactory.getLogger(SMSService.class);
    private String ACCOUNT_SID = "AC093382ce169a288a8abc475082c3b5ab";

   
    private String AUTH_TOKEN = "b67a8809665d0aaedf9e6c4733781f28";

    
    private String FROM_NUMBER = "+14159416718";

    public void send(Email sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }
}