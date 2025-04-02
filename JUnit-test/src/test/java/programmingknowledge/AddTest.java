package programmingknowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AddTest {
	MyJUnitClass junit = new MyJUnitClass();

	@Test
	void testAddValidIntegerZeroZero() {
		Assert.assertEquals(0, junit.add(0, 0));
	}

	@Test
	void testAddValidIntegerZeroNonzero() {
		Assert.assertEquals(2, junit.add(0, 2));
	}

	@Test
	void testAddValidIntegerNonzeroZero() {
		Assert.assertEquals(2, junit.add(2, 0));
	}

	@Test
	void testAddValidIntegerNegativeZero() {
		Assert.assertEquals(-2, junit.add(-2, 0));
	}

	@Test
	void testAddValidIntegerZeroNegative() {
		Assert.assertEquals(-2, junit.add(0, -2));
	}

	@Test
	void testAddValidIntegerBigNumberNonzero() {
		Assert.assertEquals((1 * 10 ^ 50) + 2, junit.add(1 * 10 ^ 50, 2));
	}

	@Test
	void testAddValidIntegerNonzeroBigNumber() {
		Assert.assertEquals((1 * 10 ^ 50) + 2, junit.add(2, 1 * 10 ^ 50));
	}

	@Test
	void testAddInvalidIntegerDecimalNonzero() {
		Assert.assertEquals(4.1, junit.add(2.1, 2));
	}

	@Test
	void testAddInvalidIntegerNonzeroDecimal() {
		Assert.assertEquals(4.1, junit.add(2, 2.1));
	}

	@Test
	void testAddInvalidIntegerDecimalDecimal() {
		Assert.assertEquals(4.2, junit.add(2.1, 2.1));
	}

}
