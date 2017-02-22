package JUnitDemo;
import java.util.Arrays;

import org.junit.Test;

public class QuickExceptionDemo {

	@Test(expected = NullPointerException.class)
	public void test_NullPointerException() {
		int[] arr = null;
		Arrays.sort(arr);
	}

	//Below test does not succeed as no Null Pointer Exception is thrown		
	@Test(expected = NullPointerException.class)
	public void test_NullPointerExceptionFailed() {
		int[] arr = {};
		Arrays.sort(arr);
	}
}
