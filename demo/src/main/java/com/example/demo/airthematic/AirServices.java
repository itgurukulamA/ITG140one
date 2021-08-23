package com.example.demo.airthematic;

import org.springframework.stereotype.Service;

@Service
public class AirServices {
	
 public int addition(Air air) {
	 return air.getFirstValue()+air.getSecondValue();
 }
 public int sub(Air air) {
	 return air.getFirstValue()-air.getSecondValue();
 }
 public int mul(Air air) {
	 return air.getFirstValue()*air.getSecondValue();
 }
 public int div(Air air) {
	 return air.getFirstValue()%air.getSecondValue();
 }
 public int mod(Air air) {
	 return air.getFirstValue()/air.getSecondValue();
 }
}
