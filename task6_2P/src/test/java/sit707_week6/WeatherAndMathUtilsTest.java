package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testTrueIsPrime() {
    	Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
    }
    
    @Test
    public void testFalseIsPrime() {
    	Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }
    
    @Test 
    public void testTrueIsEven() {
    	Assert.assertTrue(WeatherAndMathUtils.isEven(2));
    }
    
    @Test
    public void testOneIsPrime() {
    	Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
    }
    
    @Test
    public void testCancelWeatherAdviceConcerningWindSpeedAndRainFall() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 4.1));
    }
    
    @Test
    public void testWarningWeatherAdviceConcerningWindSpeed() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0));
    }
    
    @Test
    public void testWaringWeatherAdviceConcerningRainFall() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(44.0, 4.1));
    }
    
}
