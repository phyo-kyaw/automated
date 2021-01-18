package numbers;

public class BiggerAndSmaller {
	int bigger = Integer.MIN_VALUE;
	int smaller = Integer.MAX_VALUE;
	
	public void find(int[] numbers) {
		for(int n : numbers) {

			if(n > bigger) bigger = n;
			if(n < smaller) smaller =n;
		}
	}
	public int getBigger() {
		return bigger;
	}
	public void setBigger(int bigger) {
		this.bigger = bigger;
	}
	public int getSmaller() {
		return smaller;
	}
	public void setSmaller(int smaller) {
		this.smaller = smaller;
	}
	
	
}