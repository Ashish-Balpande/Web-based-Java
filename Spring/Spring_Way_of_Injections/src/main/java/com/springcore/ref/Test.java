package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		
		A temp = (A) context.getBean("aref");
		
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
		System.out.println(temp);
	}

}

//output:
//60
//90
//A [x=60, obj=B [y=90]]