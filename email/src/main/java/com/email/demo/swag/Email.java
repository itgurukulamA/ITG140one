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
public String getEmessage() {
	return emessage;
}
public void setEmessage(String emessage) {
	this.emessage = emessage;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getAttachname() {
	return attachname;
}
public void setAttachname(String attachname) {
	this.attachname = attachname;
}
}