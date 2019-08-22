package cn.ffsc.msa.springdemo.three.helperSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
		output.generateOutput();
		
	}
}
