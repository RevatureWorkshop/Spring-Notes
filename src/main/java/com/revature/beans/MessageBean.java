package com.revature.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//This is just a simple class with a single property that has a getter and setter
@Component("AnnoMessageBean") //Base Level Bean that we can have
public class MessageBean {
	
	@Value("Annotated Message") //With annotations, we get field injection
	private String message;
	
	public MessageBean() {
		System.out.println("Spring is creating me!");
	}
	
	public MessageBean(String message) {
		System.out.println("Spring is creating me with parametrized constructors!");
		this.message = message;
	}
	
	
	//Make sure to provide a setter 
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
