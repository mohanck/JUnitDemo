package JUnitDemo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Sastry C S
 *
 */
public class QuickBeforeAfterDemo {
	
	@BeforeClass
	public static void setupBeforeClass(){
		System.out.println("Before Class called");
	}

	@Before	
	public void setupTest() {
		System.out.println("Before Called");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 Called");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 Called");
	}
	
	@After	
	public void cleanupTest() {
		System.out.println("After Called");
	}
	
	@AfterClass
	public static void cleanupAfterClass(){
		System.out.println("After Class called");
	}

}
