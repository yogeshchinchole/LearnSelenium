package TestNGSssions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowersTest {

	@Parameters("brower")
	@Test
	public void testinChrome(String brower) {

	}

	@Parameters("brower")
	@Test
	public void testinFF(String brower) {

	}
}
