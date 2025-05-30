package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionServiceUnit {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

	@Test
	public void testAddEmptyNumber1() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q1Addition("", "2");
		});
	}	
	
	@Test
	public void testAddEmptyNumber2() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q1Addition("2", "");
		});
	}
	
	@Test
	public void testAddEmptyNumber1AndNumber2() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q1Addition("", "");
		});
	}
	
	@Test
	public void testAddNullNumber1() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q1Addition(null, "2");
		});
	}	
	
	@Test
	public void testAddNullNumber2() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q1Addition("2", null);
		});
	}
	
	@Test
	public void testAddNullNumber1AndNumber2() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q1Addition(null, null);
		});
	}
	
	@Test 
	public void testTrueSubtrack() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("5", "1"),4,0);
	}
	
	@Test
	public void testSubtractEmptyInput() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q2Subtraction("", "2");
		});
	}
	
	@Test
	public void testSubtractEmptyNumber2() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q2Subtraction("2", "");
		});
	}
	
	@Test
	public void testSubtractEmptyNumber1AndNumber2() {
		Assert.assertThrows(NumberFormatException.class, () -> {
			MathQuestionService.q2Subtraction("", "");
		});
	}
	
	@Test
	public void testSubtractNullNumber1() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q2Subtraction(null, "2");
		});
	}	
	
	@Test
	public void testSubtractNullNumber2() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q2Subtraction("2", null);
		});
	}
	
	@Test
	public void testSubtractNullNumber1AndNumber2() {
		Assert.assertThrows(NullPointerException.class, () -> {
			MathQuestionService.q2Subtraction(null, null);
		});
	}
}
