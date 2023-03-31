package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("AdvancedBean") //Annotations on top of the class are labelled as stereotypes. "@Bean" is not a stereotype. 

//Types of Beans: 
/*
 * @Service 
 * @Repository 
 * @Controller
 * @RestController
 * @Configuration - this is a bean that will give configurations for other beans. 
 */
public class AdvancedBean {
	
	@Autowired
	private MessageBean messageBean;
	
	@Value("Generic Name")
	private String name;
	@Value("100")
	private double quantity;
	
	
	public AdvancedBean() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("No Args constructor");
	}
	
	public AdvancedBean(MessageBean messageBean, String name, double quantity) {
		super();
		this.messageBean = messageBean;
		this.name = name;
		this.quantity = quantity;
		System.out.println("All Args constructor!");
	}
	
	public AdvancedBean(MessageBean messageBean) {
		super();
		this.messageBean = messageBean;
		System.out.println("One Args constructor!");
	}
	
	public MessageBean getMessageBean() {
		return messageBean;
	}
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	

}
