package testngscripts;

import org.testng.annotations.Test;

import graphql.Assert;

public class NewTestdependency {
	
	@Test 
	public void testMethod1() {
		System.out.println("NewTestdependency Method1");
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods = "testMethod1", alwaysRun = true)
	public void testMethod2() {
		System.out.println("NewTestdependency Method2");
	}
	
	@Test (timeOut = 1000, invocationCount = 2)
	public void testMethod3() {
		System.out.println("NewTestdependency Method3");
	}
	
	@Test (expectedExceptions = {ArithmeticException.class})
	public void testMethod4() {
		System.out.println("NewTestdependency Method4");
		System.out.println(1/0);
		
	}

}
