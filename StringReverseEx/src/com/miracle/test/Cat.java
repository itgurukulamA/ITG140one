package com.miracle.test;

public class Cat extends Dog {
	public void bark() {
		System.out.println("Cat bark loudly");
		
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();//ststic binding Dog bark loudly
		Dog d2=new Cat();
		d2.bark();//Dynamic Binding cat bark loudly
		//Indynamic binding we r assigning sub lass object to super type refernce veriable.
		
		//Dog d2=new Cat();
		Cat c2=(Cat)new Dog();//this one is downcasting and here clASS CASTING REQUIRED.
		//FOE DOWNCASTING INSTANCEOF OPERATOR IS RECUIRED.
		//abstract cass achievve 0-100 % abstraction
		//interfce achieve 100% abstracion
		
		
	}

}
