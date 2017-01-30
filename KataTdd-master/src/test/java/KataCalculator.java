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
	public void fiveStringShouldReturn5(){
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
	
	@Test
	public void twoStringShouldReturn2(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("2");
		Assert.assertEquals(2, result);
	}
	@Test
	public void fourStringShouldReturn4(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("4");
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void sixStringShouldReturn6(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("6");
		Assert.assertEquals(6, result);
	}
}
