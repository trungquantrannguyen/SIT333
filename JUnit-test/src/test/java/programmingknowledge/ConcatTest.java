package programmingknowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ConcatTest {
	MyJUnitClass junit = new MyJUnitClass();

	@Test
	void testConcatSingleCharacterSingleCharacter() {
		Assert.assertEquals(junit.concat("0","0"), "00");
	}
	
	@Test
	void testConcatSingleCharacterEmptyString() {
		Assert.assertEquals(junit.concat("0", ""), "0");
	}
	
	@Test
	void testConcatNullSingleCharacter() {
		Assert.assertEquals(junit.concat(null, "0"), "null0");
	}

	@Test
	void testConcatSingleCharacterNull() {
		Assert.assertEquals(junit.concat("0", null), "0null");
	}
	
	@Test
	void testConcatNullNull() {
		Assert.assertEquals(junit.concat(null, null), "nullnull");
	}
	
}
