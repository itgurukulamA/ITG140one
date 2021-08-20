package com.example.demo.services;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

	@Autowired
	AuthenticationManager authenticationmanager;
	@Autowired
	MyUserDetailsService userDetailsService;
	@Autowired
	SignupService signupservice;
	@Autowired
	JwtUtil jwtTokenUtil;

	@GetMapping("/home")
	public String Test() {
		return "home";
	}
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public String signup(@RequestBody UserS users) {
		int i =signupservice.Signup(users);
		if(i>0) {
			return "sign up successfull";
		}else
			return "sign up failed";
	}
@RequestMapping(value="/authenticate",method = RequestMethod.POST)
public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
	
	try {
		authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
											authenticationRequest.getPassword())
				);
		}
		catch(BadCredentialsException e) {
			throw new Exception("Incorrect user details");
		}
	final UserDetails userDetails = userDetailsService
			.loadUserByUsername(authenticationRequest.getUsername());
	final String jwt = jwtTokenUtil.generateToken(userDetails);
	return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}


//@RequestMapping("/login")
//public String loginPage()
//{
//	return "login.jsp";
//}
//
//@RequestMapping("/logout-success")
//public String logoutPage()
//{
//	return "logout.jsp";
//}
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principle) {
		return principle;
	}
}
