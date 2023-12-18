package demo;

import org.testng.annotations.Test;

public class Parameters {

	@Test
	public void m1()
	{
		System.out.println("running");
		
		String BROWSER = System.getProperty("browser");
	
		System.out.println("BROWSER");
	
	
	}
}
