package JUnitDemo;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	String actual,expected;
	boolean act,exp;

/*
""     -> ""
"A"    -> ""
"AA"   -> ""
"CD"   -> "CD"
"AABC" -> "BC"	
"ABCD" -> "BCD"
"CDEF" -> "CDEF"
*/	
	
	//""  -> ""	
	@Test
	public void testRemoveA_0Char() {
		actual = helper.removeA("");
		expected = "";
		assertEquals(expected, actual);
	}
	
	//"A" -> ""
	@Test
	public void testRemoveA_1Char() {
		actual = helper.removeA("");
		expected = "";
		assertEquals(expected, actual);
		
		actual = helper.removeA("A");
		expected = "";
		assertEquals(expected, actual);
	}
		
	//"AA" -> ""
	//"CD" -> "CD"
	@Test
	public void testRemoveA_2Chars() {
		actual = helper.removeA("AA");
		expected = "";
		assertEquals(expected, actual);
		
		actual = helper.removeA("CD");
		expected = "CD";
		assertEquals(expected, actual);
	}
	
	//"AABC" -> "BC"	
	//"ABCD" -> "BCD"
	//"CDEF" -> "CDEF"
	@Test
	public void testRemoveA_More() {
		actual = helper.removeA("ABCD");
		expected = "BCD";
		assertEquals(expected, actual);
		
		actual = helper.removeA("AABC");
		expected = "BC";
		assertEquals(expected, actual);
		
		actual = helper.removeA("CDEF");
		expected = "CDEF";
		assertEquals(expected, actual);				
	}

/*
""   -> false	
"A"  -> false
"AB" -> true
"ABAB" -> true
"ABCD" -> false
*/
	
	//""   -> false	
	//"A"  -> false
	@Test
	public void testAreFirstAndLast2CharsSame_Less() {
		act = helper.areFirstAndLast2CharsSame("");
		exp = false;
		assertFalse(act); //assertEquals(exp, act);	
		
		act = helper.areFirstAndLast2CharsSame("A");
		exp = false;
		assertFalse(act); //assertEquals(exp, act);	
	}
		
	//"AB" -> true
	@Test
	public void testAreFirstAndLast2CharsSame_Equal() {
		act = helper.areFirstAndLast2CharsSame("AB");
		exp = true;
		assertTrue(act); //assertEquals(exp, act);	
	}
	
	//"ABAB" -> true
	//"ABCD" -> false
	@Test
	public void testAreFirstAndLast2CharsSame_More() {
		act = helper.areFirstAndLast2CharsSame("ABAB");
		exp = true;
		assertTrue(act); //assertEquals(exp, act);
				
		act = helper.areFirstAndLast2CharsSame("ABCD");
		exp = false;
		assertFalse(act); //assertEquals(exp, act);	
	}	

}
