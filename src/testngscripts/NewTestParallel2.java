package testngscripts;

import org.testng.annotations.Test;

public class NewTestParallel2 {
	
	@Test 
	public void testMethod1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("New test Class2 Method1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("New test Class2 Method2");
	}
	
	@Test 
	public void testMethod3() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("New test Class2 Method3");
	}
	
	@Test  
	public void testMethod4() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("New test Class2 Method4");
	}
	
	

}
