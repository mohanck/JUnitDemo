package JUnitDemo;
import java.util.Arrays;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Sastry C S
 *
 */
public class QuickTimeOutDemo {

	@Test(timeout=100)
	public void test() {
		int arr[] = {12,34,23,0};
		for(int i=1;i<=100000;i++){
			arr[0]=i;
			Arrays.sort(arr);
		}
	}

}
