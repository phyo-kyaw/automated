package numbers;

import org.junit.Assert;
import org.junit.Test;

public class BiggerAndSmallerTest {

	@Test
	public  void numbersInIncreasingOrder() {
		// TODO Auto-generated method stub
		
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {2, 3, 4});
		
		Assert.assertEquals(4, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());

	}

}