package com.coffee.spring.hello;

//import java.sql.ResultSet;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Resource rs=new FileSystemResource("HelloMessage.xml");//老版本使用
		// BeanFactory f = new XmlBeanFactory(r);
		//封裝IOC容器并將容器中的person豆子實例提取出來
		BeanFactory f = new ClassPathXmlApplicationContext("HelloMessage.xml");
		Person person = (Person) f.getBean("person");
		String s = person.sayHello();
		System.out.println("the person is say:" + s);
	}

}
