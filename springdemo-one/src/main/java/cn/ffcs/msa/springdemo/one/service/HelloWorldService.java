package cn.ffcs.msa.springdemo.one.service;

import cn.ffcs.msa.springdemo.one.HelloWorld;
import cn.ffcs.msa.springdemo.one.StrutsHelloWorld;

public class HelloWorldService {
	 // Field type HelloWorld
    private HelloWorld helloWorld;
   
    // Constructor HelloWorldService
    // It initializes the values for the field 'helloWorld'
    public HelloWorldService()  {
          this.helloWorld = new StrutsHelloWorld();
    }

	public HelloWorld getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

}
