package cn.ffcs.msa.springdemo.one.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ffcs.msa.springdemo.one.HelloWorld;
import cn.ffcs.msa.springdemo.one.service.HelloWorldService;

public class Application {

	public static void main(String[] args) {
		 ApplicationContext context =
	                new ClassPathXmlApplicationContext("beans.xml");
	        HelloWorldService service =
	             (HelloWorldService) context.getBean("helloWorldService");
	          
	        HelloWorld hw= service.getHelloWorld();
	         
	        hw.sayHello();
	}
}
