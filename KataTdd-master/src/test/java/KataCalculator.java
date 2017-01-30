import org.junit.Assert;
import org.junit.Test;

public class KataCalculator {

	@Test
	public void emptyStringShouldReturn0(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("");
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void fiveStringShouldReturn1(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("5");
		Assert.assertEquals(5, result);
	}
	
	@Test
	public void threeStringShouldReturn3(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("3");
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void oneStringShouldReturn1(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("1");
		Assert.assertEquals(1, result);
	}
	
	
}
