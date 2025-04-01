package programmingknowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AddTest {

	@Test
	void test() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		Assert.assertEquals(300, result);
	}

}
