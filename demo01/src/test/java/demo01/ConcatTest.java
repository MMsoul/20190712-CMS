package demo01;


import org.junit.Assert;
import org.junit.Test;

public class ConcatTest {

//	private static Concat con = null;
	
	@Test
	public void testSum() {
		Concat con = new Concat();
		int sum = con.sum(1, 2);
		System.out.println(sum);
		Assert.assertEquals(3, sum);
	}

	/*
	 * @Test public void testSubtract() { int result = con.subtract(1, 2);
	 * Assert.assertEquals(-1, result); }
	 * 
	 * @Test public void testMultiply() { int result = con.multiply(1, 2);
	 * Assert.assertEquals(2, result); }
	 * 
	 * @Test public void testDivision() { int result = con.division(1, 0);
	 * Assert.assertEquals(2, result); }
	 */

}
