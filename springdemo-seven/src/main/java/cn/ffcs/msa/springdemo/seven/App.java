package cn.ffcs.msa.springdemo.seven;

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
    	ApplicationContext context = 
    	    	  new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	    	
    	    	Customer cust = (Customer)context.getBean("CustomerBean");
    	    	System.out.println(cust.getPerson().getAge());
    }
}
