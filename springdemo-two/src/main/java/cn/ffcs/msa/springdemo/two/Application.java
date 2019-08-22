package cn.ffcs.msa.springdemo.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml"); HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
