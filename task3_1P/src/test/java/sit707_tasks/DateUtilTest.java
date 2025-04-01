package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class DateUtilTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "225054634";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Tran Nguyen Trung Quan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldIncrementToFebruary1 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
		System.out.println("january31ShouldDecrementToJanuary30 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(30, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
		System.out.println("testJanuaryNominal > " + date);
		date.increment();
		System.out.println(date);
	}

	/*
	 * Complete below test cases.
	 */

	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(1, date.getMonth());

	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil min_date_of_January = new DateUtil(1, 1, 2024);
		System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + min_date_of_January);
		min_date_of_January.decrement();
		System.out.println(min_date_of_January);
		Assert.assertEquals(31, min_date_of_January.getDay());
		Assert.assertEquals(12, min_date_of_January.getMonth());
	}

	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test
	public void test1A() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("test1A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test2A() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("test2A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test3A() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("test3A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test4A() {
		DateUtil date = new DateUtil(30, 6, 1994);
		System.out.println("test4A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(29, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test5A() {
		Assert.assertThrows(RuntimeException.class, () -> {
            DateUtil date = new DateUtil(31, 6, 1994);
        });
	}
	
	@Test
	public void test6A() {
		DateUtil date = new DateUtil(15, 1, 1994);
		System.out.println("test6A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test7A() {
		DateUtil date = new DateUtil(15, 2, 1994);
		System.out.println("test7A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test8A() {
		DateUtil date = new DateUtil(15, 11, 1994);
		System.out.println("test8A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test9A() {
		DateUtil date = new DateUtil(15, 12, 1994);
		System.out.println("test9A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test10A() {
		DateUtil date = new DateUtil(15, 6, 1700);
		System.out.println("test10A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1700, date.getYear());
	}
	
	@Test
	public void test11A() {
		DateUtil date = new DateUtil(15, 6, 1701);
		System.out.println("test11A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1701, date.getYear());
	}
	
	@Test
	public void test12A() {
		DateUtil date = new DateUtil(15, 6, 2023);
		System.out.println("test12A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test13A() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("test13A > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(14, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	
	@Test
	public void test1B() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("test1B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test2B() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("test2B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test3B() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("test3B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test4B() {
		DateUtil date = new DateUtil(30, 6, 1994);
		System.out.println("test4B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test5B() {
		Assert.assertThrows(RuntimeException.class, () -> {
            DateUtil date = new DateUtil(31, 6, 1994);
        });
	}
	
	@Test
	public void test6B() {
		DateUtil date = new DateUtil(15, 1, 1994);
		System.out.println("test6B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test7B() {
		DateUtil date = new DateUtil(15, 2, 1994);
		System.out.println("test7B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test8B() {
		DateUtil date = new DateUtil(15, 11, 1994);
		System.out.println("test8B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test9B() {
		DateUtil date = new DateUtil(15, 12, 1994);
		System.out.println("test9B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void test10B() {
		DateUtil date = new DateUtil(15, 6, 1700);
		System.out.println("test10B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1700, date.getYear());
	}
	
	@Test
	public void test11B() {
		DateUtil date = new DateUtil(15, 6, 1701);
		System.out.println("test11B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1701, date.getYear());
	}
	
	@Test
	public void test12B() {
		DateUtil date = new DateUtil(15, 6, 2023);
		System.out.println("test12B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test13B() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("test13B > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
}
