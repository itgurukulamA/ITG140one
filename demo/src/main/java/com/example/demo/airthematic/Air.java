package com.example.demo.airthematic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Air {
private int firstValue;
private int secondValue;
public Air(int firstValue, int secondValue) {
	super();
	this.firstValue = firstValue;
	this.secondValue = secondValue;
 }
}
