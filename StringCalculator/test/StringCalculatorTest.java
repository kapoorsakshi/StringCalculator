import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {
	
	////////////Requirement 8
	
		@Test
		public void numberGreaterThan1000isIgnoredInAddition() {
			
			Assert.assertEquals(20, StringCalculator.add("5,10,5,1001"),0);
		}
		
	//////////Requirement 7
		
		@Test(expected= RuntimeException.class)
		public void whenNegativeNumberThenExceptionIsThrown() {
			StringCalculator.add("10,5,5,-2");
		}
		
		
	//////////Requirement 5
	@Test
	public void whenLinesisAlsoInsertedBetweenNunbers() {
		
		Assert.assertEquals(10, StringCalculator.add("5\n3\n1,1"));
	}
	
	
	//////Requirement 4
	
	@Test
	public void whenAnyCountofNumbersAreusedItReturnsSum() {
		Assert.assertEquals(14, StringCalculator.add("7,5,1,1"));
	}
	
	
	/////////Requirement 1
	
	/* cannot work now
	@Test (expected=RuntimeException.class)
	public void whenMoreThan2NumbersAreUsedThenExpectationThrown() {
		
		StringCalculator.add("1,2,3");
		
	}*/
	
	@Test
	public void when2NumbersAreUsedThenNoExpectionIsThrown() {
		
		StringCalculator.add("1,2");
		Assert.assertTrue(true);
	}
	
	@Test (expected=RuntimeException.class)
	public void whenNonNumberisUsedExceptionIsThrown() {
		
		StringCalculator.add("1,x");
	}
	
	////////////Requirement 2 
	
	@Test
	public void whenEmptyStringIsPassedItWillReturnFalse() {
				 
		Assert.assertEquals(0, StringCalculator.add(""));
	}
	///////////Requirement 3
	
	@Test
	public void when2NumbersareSentTheirsumWillbeReturned() {
	
	Assert.assertEquals(10, StringCalculator.add("8,2"));
	}

}
