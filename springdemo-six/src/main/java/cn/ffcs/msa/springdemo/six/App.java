package cn.ffcs.msa.springdemo.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml"); 
    	Customer customer = (Customer) context.getBean("customer");
    	System.out.println(customer.getAddress().getFulladdress());
    }
}
