package com.coffee.spring.hello;

public class Person {
 private IHelloMessage helloMessage;
 public void setHelloMessage(IHelloMessage helloMessage) {
	this.helloMessage = helloMessage;
}
 public IHelloMessage getHelloMessage() {
	return helloMessage;
}
 
 public String sayHello() {
	return this.helloMessage.sayHello();
}
}
