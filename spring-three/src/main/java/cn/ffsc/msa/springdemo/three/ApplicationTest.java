package cn.ffsc.msa.springdemo.three;

public class ApplicationTest {
	public static void main( String[] args )
    {
    	IOutputGenerator output = new CsvOutputGenerator();
    	output.generateOutput();
    }
}
