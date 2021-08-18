package com.example.demo.services;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecureController {
@RequestMapping("/")
public String Test() {
	return "home.jsp";
}

@RequestMapping("/login")
public String loginPage()
{
	return "login.jsp";
}

@RequestMapping("/logout-success")
public String logoutPage()
{
	return "logout.jsp";
}
@RequestMapping("user")
@ResponseBody
public Principal user(Principal principle)
{
	return principle;
}
}
