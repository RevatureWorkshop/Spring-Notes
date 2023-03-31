package com.revature;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.AdvancedBean;
import com.revature.beans.MessageBean;

public class MainDriver {
	
	/**
	 * 
	 * What is Spring?
	 * 	Spring is an open-source, module based, Java framework. 
	 * 	Spring aims to simplify the development, testing and deployment process of Java applications by 
	 * 	providing a flexible framework. 
	 * 
	 * What is a module?
	 * 	A grouping of libraries that work together to achieve some goal. 
	 * 	In Spring, that typically looks like a Maven dependency. 
	 * 
	 * Modules in Spring?
	 * 	Spring Core, Spring Beans, Spring Context, Spring ORM, Spring AOP (Aspect Oriented Programming), 
	 * 	Spring Security, Spring Test, Spring GraphQL, Spring Batch... 
	 * 
	 * Features of Spring?
	 * 	>Inversion Of Control (IoC) container: this is the core feature in Spring that enables the management
	 * 	of beans (Java components) 
	 * 	> Dependency Injection (DI): Spring also provides support for DI, making it easier to manage components. 
	 * 	> AOP : Manage Cross Cutting Concerns (logging, security, caching, etc . )
	 * 	> MVC (Model View Controller) : Enables to create web APIs 
	 * 	> Spring Data
	 *  > Spring Security
	 *  > Spring Cloud
	 *  
	 *  
	 *  BeanFactory vs ApplicationContext?
	 *  	ApplicationContext is a type of BeanFactory (it extends it). With ApplicaitonContext we get a lot of benefits 
	 *  	and features (e.g. PostBeanProcessing and more AOP features).
	 *  
	 *  	BeanFactory is technically faster, so if performance REALLY REALLY ,matters, then we can use BeanFactory.
	 */

	
	// The legacy IoC container that Spring provides to manage our Beans
	private static BeanFactory beanFactory;
	
	//This is Spring's current IoC container that Spring uses 
	private static ApplicationContext appContext;
	private static ApplicationContext autowireContext;
	private static ApplicationContext annotateContext;
	
	public static void main(String[] args) {
		

//		appContext = new ClassPathXmlApplicationContext("beans-manual.xml");
//
//		MessageBean messageBean = (MessageBean) appContext.getBean("FirstMessageBean");
//		messageBean = (MessageBean) appContext.getBean("UsefuleBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		messageBean = (MessageBean) appContext.getBean("ConstructorBean");
//		
//		System.out.println(messageBean.getMessage());
//		
//		AdvancedBean aBean = (AdvancedBean) appContext.getBean("AdvancedBeanFirst");
//		System.out.println(aBean.getMessageBean().getMessage());
		
		
		
//		-----------------AUTOWIRE SECTION-------------------------------
		
//		autowireContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
//		
//		AdvancedBean autowireBean = (AdvancedBean) autowireContext.getBean("AdvancedBeanByConstructorAllArgs");
//		
//		System.out.println(autowireBean.getMessageBean().getMessage());
		
		
//		-----------------ANNOTATION SECTION-------------------------------
		
		annotateContext = new ClassPathXmlApplicationContext("beans-annotations.xml");
		
		MessageBean messageBean = (MessageBean) annotateContext.getBean("AnnoMessageBean");
		
		System.out.println(messageBean.getMessage());
		
		AdvancedBean annotatedBean = (AdvancedBean) annotateContext.getBean("AdvancedBean");
		
		System.out.println(annotatedBean.getMessageBean().getMessage());
		System.out.println(annotatedBean.getName());
		
		
	}

}
