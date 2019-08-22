package cn.ffsc.msa.springdemo.three.helper;

import cn.ffsc.msa.springdemo.three.CsvOutputGenerator;
import cn.ffsc.msa.springdemo.three.IOutputGenerator;

//代理模式
public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public OutputHelper(){
		outputGenerator = new CsvOutputGenerator();
	}
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
}
