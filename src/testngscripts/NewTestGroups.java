package testngscripts;

import org.testng.annotations.Test;

public class NewTestGroups {
	
	@Test (groups = "smoke")
	public void testMethod1() {
		System.out.println("New test Class2 Method1");
	}
	
	@Test(groups = "smoke")
	public void testMethod2() {
		System.out.println("New test Class2 Method2");
	}
	
	@Test (groups = "regression")
	public void testMethod3() {
		System.out.println("New test Class2 Method3");
	}
	
	@Test  (groups = "regression")
	public void testMethod4() {
		System.out.println("New test Class2 Method4");
	}
	
	@Test  (groups = {"french","smoke"})
	public void testMethod5() {
		System.out.println("New test Class2 Method5");
	}

}
