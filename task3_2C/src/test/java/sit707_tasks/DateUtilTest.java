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
    public void testIncrementMidMonth() {
        DateUtil date = new DateUtil(15, 3, 2022);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2022, date.getYear());
    }

    // Increment end of 30-day month
    @Test
    public void testIncrementEndOf30DayMonth() {
        DateUtil date = new DateUtil(30, 4, 2022);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    // Increment end of 31-day month
    @Test
    public void testIncrementEndOf31DayMonth() {
        DateUtil date = new DateUtil(31, 7, 2022);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
    }

    // Increment end of year
    @Test
    public void testIncrementEndOfYear() {
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    // Increment Feb 28 on non-leap year
    @Test
    public void testIncrementFeb28NonLeapYear() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    // Increment Feb 28 on leap year
    @Test
    public void testIncrementFeb28LeapYear() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    // Decrement mid-month
    @Test
    public void testDecrementMidMonth() {
        DateUtil date = new DateUtil(15, 6, 2022);
        date.decrement();
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }

    // Decrement from 1st to previous month
    @Test
    public void testDecrementToPreviousMonth() {
        DateUtil date = new DateUtil(1, 5, 2022);
        date.decrement();
        Assert.assertEquals(30, date.getDay()); // April has 30 days
        Assert.assertEquals(4, date.getMonth());
    }

    // Decrement from 1st Jan to previous year
    @Test
    public void testDecrementToPreviousYear() {
        DateUtil date = new DateUtil(1, 1, 2023);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2022, date.getYear());
    }

    // Decrement March 1 in a leap year → should go to Feb 29
    @Test
    public void testDecrementMarch1LeapYear() {
        DateUtil date = new DateUtil(1, 3, 2020);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    // Decrement March 1 in non-leap year → should go to Feb 28
    @Test
    public void testDecrementMarch1NonLeapYear() {
        DateUtil date = new DateUtil(1, 3, 2023);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
	
}
