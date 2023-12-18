package com.ty.inject_value_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

public static void main(String[] args) {
		
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_config.xml");
		Student student=(Student)appCont.getBean("myStudent");
		
		System.out.println("name is : "+student.getName());
		System.out.println("Age is : "+student.getAge());
		System.out.println("Height is : "+student.getHeight ());
		
}
}
