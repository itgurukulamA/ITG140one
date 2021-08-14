package com.email.demo.swag;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Email {

private String emessage;
private String subject;
private String to;
private String message;
private String attachname;
@Override
public String toString() {
    return "SMS{" +
            "to='" + to + '\'' +
            ", message='" + message + '\'' +
            '}';
}
}
