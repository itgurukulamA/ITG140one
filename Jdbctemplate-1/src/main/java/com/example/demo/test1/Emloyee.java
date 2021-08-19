package com.example.demo.test1;



public class Emloyee {

private int eid;
private String ename;
private int emobile;
private String email;
public Emloyee(int eid, String ename, int emobile, String email) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.emobile = emobile;
	this.email = email;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEmobile() {
	return emobile;
}
public void setEmobile(int emobile) {
	this.emobile = emobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
