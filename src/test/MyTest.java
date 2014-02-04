package test;

import static org.junit.Assert.assertEquals;
import math.MyMath;

import org.junit.Test;

public class MyTest {

	@Test
	public void testMulti() {
		MyMath m = new MyMath();
		assertEquals(50, m.multi(5, 10));
	}

}