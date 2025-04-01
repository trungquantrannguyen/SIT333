package iloveyouboss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

class ScoreCollectionTest {

	@Test
	void checkArithmeticMeanOfTwoNumber() {
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);
		
		int actualResult = collection.arithmeticMean();
		Assert.assertThat(actualResult, equalTo(6));
		
	}

}
