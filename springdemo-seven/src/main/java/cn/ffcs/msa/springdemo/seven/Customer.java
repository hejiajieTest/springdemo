package cn.ffcs.msa.springdemo.seven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	@Qualifier(value="PersonBean")
	@Autowired
	private Person person;
	private int type;
	private String action;
	//getter and setter methods
	
	//@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Person getPerson() {
		return person;
	}
	
}
