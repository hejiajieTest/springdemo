package cn.ffcs.msa.springdemo.five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring注入之构造函数
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml"); 
    	Developer developer = (Developer) context.getBean("developer");
    	System.out.println(developer.getLanguage().getName());
    }
}
