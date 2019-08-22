package cn.ffcs.msa.springdemo.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Lenovo
 *spring注入之bytype
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml"); 
		Person person = (Person) context.getBean("person");
				System.out.println(person.getAbility().getSkill());
	}
}
