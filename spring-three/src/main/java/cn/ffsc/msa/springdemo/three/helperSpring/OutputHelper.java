package cn.ffsc.msa.springdemo.three.helperSpring;

import cn.ffsc.msa.springdemo.three.IOutputGenerator;

//装配器模式
/**
 * 
 * @author Lenovo
 *
 *get注入和set方法名有关
 *outputGenerator 对应 setOutputGenerator
 *outputGenerator1 对应 setOutputGenerator1
 */
public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}
