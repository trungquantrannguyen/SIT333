package programmingknowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ConcatTest {

	@Test
	void test() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.concat("Hello", "World");
		Assert.assertEquals("HelloWord", result);
	}

}
