package mofa;

import org.testng.Assert;

public class Test {
	
	@org.testng.annotations.Test
	public void sum() {
		int a = 1;
		int b = 2;
		Assert.assertEquals(3, a+b);	
	}

}
