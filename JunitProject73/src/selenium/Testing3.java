package selenium;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
    
	@Rule
    public ErrorCollector err = new ErrorCollector();
	@Test
	public void test6() {
		String expected ="abc";
		String actual = "abc";
		System.out.println("Before 1st Assert");
		Assert.assertEquals(expected, actual);//hard or regular assert, and we use this assert 
		System.out.println("After 1st Assert");
		Assert.assertTrue("Verifying 2>3", 2>3);
		System.out.println("After 2nd Assert");
		
	}

	@Test
	public void test7() {
		String expected ="abc";
		String actual = "abc";
		System.out.println("Before 1st Assert");
		try {
		Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in 1st Catch");
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verifying 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in 2nd Catch");
		}
		System.out.println("After 2nd Assert");
		
	}

}
